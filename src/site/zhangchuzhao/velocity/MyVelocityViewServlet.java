package site.zhangchuzhao.velocity;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/10/10 16:41
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class MyVelocityViewServlet extends VelocityViewServlet {
    @Override
    protected Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context ctx) {
        // 往Context容器存放变量
        ctx.put("fullName","zhangchuzhao");
        // 也可以往request域中存值
        request.setAttribute("anotherName","Devin");
        // forward到指定模板
        return getTemplate("test.vm");
    }
}
