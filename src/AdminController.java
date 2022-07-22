package com.jd.data.server.app.api;

import com.jd.data.server.app.service.AdminService;
import com.jd.data.server.common.util.DataUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by wangbolin on 2017/9/29
 * 执行sql.
 */
@RestController
@ResponseBody
@RequestMapping(value = "/sys", method = {RequestMethod.POST, RequestMethod.GET})
public class AdminController extends BaseController {

    protected static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    private static final String pwd = "dataServer001!";

    @Autowired
    private AdminService adminService;

    @RequestMapping("/sql")
    public Map<String, Object> executeSql(@RequestBody Map<String, Object> param) throws Exception {
        if (DataUtils.isEmpty(param.get("pwd")) || !pwd.equals(DataUtils.obj2str(param.get("pwd")))) {
            return result("口令错误!");
        }
        param.remove("pwd");
        logger.info("executeSql params is " + param);
        if (DataUtils.isNotEmpty(param.get("command")) && DataUtils.isNotEmpty(param.get("sql"))) {
            switch (DataUtils.obj2int(param.get("command")).intValue()) {
                case 0:
                    return result(adminService.updateSql(DataUtils.obj2str(param.get("sql"))));
                case 1:
//                    return result(adminService.selectSql(DataUtils.castStr(param.get("sql"))));
                case 2:
                    return result(adminService.insertSql(DataUtils.obj2str(param.get("sql"))));
                case 3:
//                    return result(adminService.deleteSql(DataUtils.castStr(param.get("sql"))));
                default:
                    return result(adminService.updateSql(DataUtils.obj2str(param.get("sql"))));
            }
        } else if (DataUtils.isNotEmpty(param.get("sql"))) {
            return result(adminService.updateSql(DataUtils.obj2str(param.get("sql"))));
        } else {
            return result("where is sql ?");
        }
    }
    
    @RequestMapping("/tables")
    public Map<String, Object> tables() throws Exception {
    	return result(adminService.tables());
    }

}
