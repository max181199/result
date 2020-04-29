package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.generatorOneServicePage;
import pageEntity.oneServicePage;
import ent.tariffEntity;
import DAO.generatorServicePage;
import pageEntity.servicePage;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public final class oneService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_label_path_cssStyle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_options_items_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path_id;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_label_path_cssStyle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_options_items_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_method.release();
    _jspx_tagPool_form_textarea_path_id_cssStyle_nobody.release();
    _jspx_tagPool_form_label_path_cssStyle.release();
    _jspx_tagPool_form_options_items_cssStyle_nobody.release();
    _jspx_tagPool_form_input_path_id_cssStyle_nobody.release();
    _jspx_tagPool_form_select_path_id.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>oneService_EXT_</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"display: flex\">\n");
      out.write("    <div>\n");
      out.write("        <div style=\"margin-top: 0;width: 45vw; border: 1px solid black;margin-bottom: 0 \">\n");
      out.write("            <h2 style=\"text-align: center;margin-top: 1vh;margin-bottom: 1vh\"> Service Info </h2>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"border: 1px solid black; width: 45vw ; margin-bottom: 0;margin-top: 0\">\n");
      out.write("            <div style=\"margin-bottom: 2vh;margin-right: 0; margin-top: 2vh;margin-left: 2vw\">\n");
      out.write("                <a href=\"/service\" style=\"width: 4vw;margin: 0;\">\n");
      out.write("                    <button id=\"back\" style=\"height: 7vh;width: 10vw;margin:0;\">\n");
      out.write("                        <p style=\"margin: 0;font-size: 2vmin;\" > All Service </p>\n");
      out.write("                    </button>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"");
      out.print( "/service/delete/" + request.getAttribute("absName"));
      out.write("\" style=\"width: 4vw;margin: 0;\">\n");
      out.write("                    <button id=\"delete\" style=\"height: 7vh;width: 10vw;margin:0;\">\n");
      out.write("                        <p style=\"margin: 0;font-size: 2vmin;\" > Delete </p>\n");
      out.write("                    </button>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"");
      out.print( "/service/tariff/add/" + request.getAttribute("absName"));
      out.write("\" style=\"width: 4vw;margin: 0;\">\n");
      out.write("                    <button id=\"addTariff\" style=\"height: 7vh;width: 10vw;margin:0;\">\n");
      out.write("                        <p style=\"margin: 0;font-size: 2vmin;\" > Add Tariff </p>\n");
      out.write("                    </button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"border: 1px solid black; width: 50vw ; margin-bottom: 0;margin-top: 0;height: 76vh;max-height: 76vh;overflow-y: auto;\">\n");
      out.write("            ");

                generatorServicePage hellgen = new generatorServicePage();
                hellgen.setServiceName((String) request.getAttribute("absName"));
                int alreadyUse = -1;
                for (servicePage sep : hellgen.getPageService()){
                    if(sep.getServiceTariff() != null){
                        alreadyUse=sep.getServiceTariff().getId();
            
      out.write("\n");
      out.write("                    <div style=\"display: flex\">\n");
      out.write("                        <p style=\"margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh;color: green;margin-bottom: 0\"> Actual Tariff :: </p>\n");
      out.write("                        <a href=\"");
      out.print( "/service/tariff/" + alreadyUse);
      out.write("\" style=\"width: 1vw;margin: 0;\">\n");
      out.write("                            <button id=\"tariffUpdate\" style=\"height: 2.3vh;width: 10vw;margin-top: 2vh; margin-left: 2vw;\">\n");
      out.write("                                <p style=\"margin: 0;font-size: 1.4vmin;\" > Update Tariff </p>\n");
      out.write("                            </button>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <p id=\"actualId\"     style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 1vh;margin-bottom: 0\"> ID :: ");
      out.print( sep.getServiceTariff().getId());
      out.write("</p>\n");
      out.write("                    <p id=\"actualValue\"  style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> VALUE :: ");
      out.print( sep.getServiceTariff().getValue());
      out.write("</p>\n");
      out.write("                    <p id=\"actualDpmode\" style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> DP Mode :: ");
      out.print( sep.getServiceTariff().getDaypaymode());
      out.write("</p>\n");
      out.write("                    <p id=\"actualActual\" style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> Actual :: ");
      out.print( sep.getServiceTariff().getState());
      out.write("</p>\n");
      out.write("                    <p id=\"actualCost\"   style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> Cost :: ");
      out.print( sep.getServiceTariff().getCost());
      out.write("</p>\n");
      out.write("                    <p id=\"actualCreate\" style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> Create :: ");
      out.print( sep.getServiceTariff().getCreate_time());
      out.write("</p>\n");
      out.write("            ");
}}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                generatorOneServicePage gen = new generatorOneServicePage();

                gen.setServiceTariffId((Integer) request.getAttribute("tariffId"));
                if ((Integer) request.getAttribute("tariffId") != 0){
                    gen.setServiceTariffIdFilter(true);
                }
                else {
                    gen.setServiceTariffIdFilter(false);
                }
                gen.setServiceTariffCost((Float) request.getAttribute("tariffCost"));
                if ((Float) request.getAttribute("tariffCost") != 0.0){
                    gen.setServiceTariffCostFilter(true);
                }
                else {
                    gen.setServiceTariffCostFilter(false);
                }
                gen.setServiceTariffValue((Float) request.getAttribute("tariffValue"));
                if ((Float) request.getAttribute("tariffValue") != 0.0){
                    gen.setServiceTariffValueFilter(true);
                }
                else {
                    gen.setServiceTariffValueFilter(false);
                }
                gen.setServiceTariffActual((Boolean) request.getAttribute("tariffActual"));
                if ((Boolean) request.getAttribute("tariffActual")){
                    gen.setServiceTariffActualFilter(true);
                }
                else{
                    gen.setServiceTariffActualFilter(false);
                }
                gen.setServiceTariffDaypaymode((Boolean) request.getAttribute("tariffDaypaymode"));
                if ((Boolean) request.getAttribute("tariffDaypaymode")){
                    gen.setServiceTariffDaypaymodeFilter(true);
                }
                else{
                    gen.setServiceTariffDaypaymodeFilter(false);
                }
                if (  request.getAttribute("tariffDataDay").toString().equals("--") || request.getAttribute("tariffDataMonth").toString().equals("--") ||
                request.getAttribute("tariffDataYearFP").toString().equals("--") || request.getAttribute("tariffDataYearSP").toString().equals("--")
                ){
                    gen.setServiceTariffDateFilter(false);
                }
                else {
                    String year = request.getAttribute("tariffDataYearFP").toString() + request.getAttribute("tariffDataYearSP").toString();
                    String month = request.getAttribute("tariffDataMonth").toString();
                    String day =  request.getAttribute("tariffDataDay").toString();
                    Calendar calendar = new GregorianCalendar(Integer.valueOf(year) , Integer.valueOf(month)-1 , Integer.valueOf(day)-1);
//                    out.println(calendar);
//                    out.println(calendar.getTime());
//                    out.println(calendar.getTime().getTime());
//                    out.println(new Date().getTime());
                    gen.setServiceTariffDate(calendar.getTime());
                    gen.setServiceTariffDateFilter(true);
                }


                gen.setServiceName((String) request.getAttribute("absName")); 
      out.write("\n");
      out.write("            <p style=\"margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh;color: red;margin-bottom: 0\"> Other Tariff :: </p>\n");
      out.write("            ");

                for (oneServicePage osp : gen.getPageOneService() ){
                    for (tariffEntity tae : osp.getTariff()){
                        if (tae.getId() != alreadyUse){
      out.write("\n");
      out.write("                        <p id=\"allId\"     style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 1vh;margin-bottom: 0\"> ID :: ");
      out.print( tae.getId());
      out.write("</p>\n");
      out.write("                        <p id=\"allValue\"  style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> VALUE :: ");
      out.print( tae.getValue());
      out.write("</p>\n");
      out.write("                        <p id=\"allDpmode\" style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> DP Mode :: ");
      out.print( tae.getDaypaymode());
      out.write("</p>\n");
      out.write("                        <p id=\"allActual\" style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> Actual :: ");
      out.print( tae.getState());
      out.write("</p>\n");
      out.write("                        <p id=\"allCost\"   style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> Cost :: ");
      out.print( tae.getCost());
      out.write("</p>\n");
      out.write("                        <p id=\"allCreate\" style=\"margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0\"> Create :: ");
      out.print( tae.getCreate_time());
      out.write("</p>\n");
      out.write("            ");
 } } }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setMethod("POST");
    _jspx_th_form_form_0.setModelAttribute("os_model");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <input id=\"update\" type=\"submit\" value=\"Update\" style=\"font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh\" />\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <div style=\"margin-left: 2vw\">\n");
          out.write("        <div style=\"margin-top: 0;width: 50vw; border: 1px solid black;margin-bottom: 0 \">\n");
          out.write("            <h2 style=\"text-align: center;margin-top: 1vh;margin-bottom: 1vh\"> Tariff Info  </h2>\n");
          out.write("        </div>\n");
          out.write("        <div style=\"border: 1px solid black; width: 50vw ; margin-bottom: 0;margin-top: 0\">\n");
          out.write("            <div>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_checkbox_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_checkbox_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_label_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_form_select_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          if (_jspx_meth_form_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <input id=\"filter\" type=\"submit\" value=\"Filter\" style=\"font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh\" />\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_modelAttribute_method.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_0 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_0.setPageContext(_jspx_page_context);
    _jspx_th_form_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_0.setPath("serviceName");
    _jspx_th_form_label_0.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_0 = _jspx_th_form_label_0.doStartTag();
      if (_jspx_eval_form_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Name :: ");
          int evalDoAfterBody = _jspx_th_form_label_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_0.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setId("serviceName");
    _jspx_th_form_input_0.setPath("serviceName");
    _jspx_th_form_input_0.setCssStyle("margin-right :  1vw;font-size: 2vmin");
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_1 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_1.setPageContext(_jspx_page_context);
    _jspx_th_form_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_1.setPath("serviceType");
    _jspx_th_form_label_1.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_1 = _jspx_th_form_label_1.doStartTag();
      if (_jspx_eval_form_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Type :: ");
          int evalDoAfterBody = _jspx_th_form_label_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_1.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setId("serviceType");
    _jspx_th_form_input_1.setPath("serviceType");
    _jspx_th_form_input_1.setCssStyle("margin-right :  1vw;font-size: 2vmin");
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_2 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_2.setPageContext(_jspx_page_context);
    _jspx_th_form_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_2.setPath("serviceState");
    _jspx_th_form_label_2.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_2 = _jspx_th_form_label_2.doStartTag();
      if (_jspx_eval_form_label_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("State :: ");
          int evalDoAfterBody = _jspx_th_form_label_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_2.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_checkbox_0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_form_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_checkbox_0.setId("serviceState");
    _jspx_th_form_checkbox_0.setPath("serviceState");
    _jspx_th_form_checkbox_0.setCssStyle("margin-right :  1vw;font-size: 2vmin");
    int[] _jspx_push_body_count_form_checkbox_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_checkbox_0 = _jspx_th_form_checkbox_0.doStartTag();
      if (_jspx_th_form_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_checkbox_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_checkbox_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_checkbox_0.doFinally();
      _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.reuse(_jspx_th_form_checkbox_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_3 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_3.setPageContext(_jspx_page_context);
    _jspx_th_form_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_3.setPath("serviceDescribe");
    _jspx_th_form_label_3.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_3 = _jspx_th_form_label_3.doStartTag();
      if (_jspx_eval_form_label_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Describe :: ");
          int evalDoAfterBody = _jspx_th_form_label_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_3.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_0.setId("serviceDescribe");
    _jspx_th_form_textarea_0.setPath("serviceDescribe");
    _jspx_th_form_textarea_0.setCssStyle("margin-right :  1vw; margin-left:1vw; max-width: 42vw; max-height: 58vh;margin-top: 2vh;font-size: 2vmin; width: 42vw;height: 58vh");
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_path_id_cssStyle_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_4 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_4.setPageContext(_jspx_page_context);
    _jspx_th_form_label_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_4.setPath("tariffId");
    _jspx_th_form_label_4.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_4 = _jspx_th_form_label_4.doStartTag();
      if (_jspx_eval_form_label_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Id :: ");
          int evalDoAfterBody = _jspx_th_form_label_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_4.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setId("tariffId");
    _jspx_th_form_input_2.setPath("tariffId");
    _jspx_th_form_input_2.setCssStyle("margin-right :  1vw;font-size: 2vmin;width: 3.5vmin");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_5 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_5.setPageContext(_jspx_page_context);
    _jspx_th_form_label_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_5.setPath("tariffCost");
    _jspx_th_form_label_5.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_5 = _jspx_th_form_label_5.doStartTag();
      if (_jspx_eval_form_label_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Cost :: ");
          int evalDoAfterBody = _jspx_th_form_label_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_5.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_5);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setId("tariffCost");
    _jspx_th_form_input_3.setPath("tariffCost");
    _jspx_th_form_input_3.setCssStyle("margin-right :  1vw;font-size: 2vmin;width: 5vw");
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_6 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_6.setPageContext(_jspx_page_context);
    _jspx_th_form_label_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_6.setPath("tariffValue");
    _jspx_th_form_label_6.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_6 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_6 = _jspx_th_form_label_6.doStartTag();
      if (_jspx_eval_form_label_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Value :: ");
          int evalDoAfterBody = _jspx_th_form_label_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_6.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_6);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_4.setPageContext(_jspx_page_context);
    _jspx_th_form_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_4.setId("tariffValue");
    _jspx_th_form_input_4.setPath("tariffValue");
    _jspx_th_form_input_4.setCssStyle("margin-right :  1vw;font-size: 2vmin;width: 5vw");
    int[] _jspx_push_body_count_form_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_4 = _jspx_th_form_input_4.doStartTag();
      if (_jspx_th_form_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_4.doFinally();
      _jspx_tagPool_form_input_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_7 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_7.setPageContext(_jspx_page_context);
    _jspx_th_form_label_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_7.setPath("tariffActual");
    _jspx_th_form_label_7.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_7 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_7 = _jspx_th_form_label_7.doStartTag();
      if (_jspx_eval_form_label_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Actual :: ");
          int evalDoAfterBody = _jspx_th_form_label_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_7.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_7);
    }
    return false;
  }

  private boolean _jspx_meth_form_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_checkbox_1 = (org.springframework.web.servlet.tags.form.CheckboxTag) _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_form_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_checkbox_1.setId("tariffActual");
    _jspx_th_form_checkbox_1.setPath("tariffActual");
    _jspx_th_form_checkbox_1.setCssStyle("margin-right :  1vw;font-size: 2vmin");
    int[] _jspx_push_body_count_form_checkbox_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_checkbox_1 = _jspx_th_form_checkbox_1.doStartTag();
      if (_jspx_th_form_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_checkbox_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_checkbox_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_checkbox_1.doFinally();
      _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.reuse(_jspx_th_form_checkbox_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_8 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_8.setPageContext(_jspx_page_context);
    _jspx_th_form_label_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_8.setPath("tariffDaypaymode");
    _jspx_th_form_label_8.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_8 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_8 = _jspx_th_form_label_8.doStartTag();
      if (_jspx_eval_form_label_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("DP Mode :: ");
          int evalDoAfterBody = _jspx_th_form_label_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_8.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_8);
    }
    return false;
  }

  private boolean _jspx_meth_form_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_checkbox_2 = (org.springframework.web.servlet.tags.form.CheckboxTag) _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_form_checkbox_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_checkbox_2.setId("tariffDaypaymode");
    _jspx_th_form_checkbox_2.setPath("tariffDaypaymode");
    _jspx_th_form_checkbox_2.setCssStyle("margin-right :  1vw;font-size: 2vmin");
    int[] _jspx_push_body_count_form_checkbox_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_checkbox_2 = _jspx_th_form_checkbox_2.doStartTag();
      if (_jspx_th_form_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_checkbox_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_checkbox_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_checkbox_2.doFinally();
      _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.reuse(_jspx_th_form_checkbox_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_9 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_9.setPageContext(_jspx_page_context);
    _jspx_th_form_label_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_9.setPath("tariffDataDay");
    _jspx_th_form_label_9.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_9 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_9 = _jspx_th_form_label_9.doStartTag();
      if (_jspx_eval_form_label_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" День :: ");
          int evalDoAfterBody = _jspx_th_form_label_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_9.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_9);
    }
    return false;
  }

  private boolean _jspx_meth_form_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_0.setPageContext(_jspx_page_context);
    _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_0.setId("tariffDataDay");
    _jspx_th_form_select_0.setPath("tariffDataDay");
    int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
      if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_form_options_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_0, _jspx_page_context, _jspx_push_body_count_form_select_0))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_form_select_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_0.doFinally();
      _jspx_tagPool_form_select_path_id.reuse(_jspx_th_form_select_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_0 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_0.setPageContext(_jspx_page_context);
    _jspx_th_form_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
    _jspx_th_form_options_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListDay}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_0.setCssStyle("font-size: 2vmin;");
    int[] _jspx_push_body_count_form_options_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_0 = _jspx_th_form_options_0.doStartTag();
      if (_jspx_th_form_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_0.doFinally();
      _jspx_tagPool_form_options_items_cssStyle_nobody.reuse(_jspx_th_form_options_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_10(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_10 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_10.setPageContext(_jspx_page_context);
    _jspx_th_form_label_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_10.setPath("tariffDataMonth");
    _jspx_th_form_label_10.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_10 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_10 = _jspx_th_form_label_10.doStartTag();
      if (_jspx_eval_form_label_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" Месяц :: ");
          int evalDoAfterBody = _jspx_th_form_label_10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_10.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_10);
    }
    return false;
  }

  private boolean _jspx_meth_form_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_1 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_1.setPageContext(_jspx_page_context);
    _jspx_th_form_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_1.setId("tariffDataMonth");
    _jspx_th_form_select_1.setPath("tariffDataMonth");
    int[] _jspx_push_body_count_form_select_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_1 = _jspx_th_form_select_1.doStartTag();
      if (_jspx_eval_form_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_form_options_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_1, _jspx_page_context, _jspx_push_body_count_form_select_1))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_form_select_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_1.doFinally();
      _jspx_tagPool_form_select_path_id.reuse(_jspx_th_form_select_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_1 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_1.setPageContext(_jspx_page_context);
    _jspx_th_form_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_1);
    _jspx_th_form_options_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListMonth}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_1.setCssStyle("font-size: 2vmin;");
    int[] _jspx_push_body_count_form_options_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_1 = _jspx_th_form_options_1.doStartTag();
      if (_jspx_th_form_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_1.doFinally();
      _jspx_tagPool_form_options_items_cssStyle_nobody.reuse(_jspx_th_form_options_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_11(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_11 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_11.setPageContext(_jspx_page_context);
    _jspx_th_form_label_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_11.setPath("tariffDataYearFP");
    _jspx_th_form_label_11.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_11 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_11 = _jspx_th_form_label_11.doStartTag();
      if (_jspx_eval_form_label_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" Год :: ");
          int evalDoAfterBody = _jspx_th_form_label_11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_11.doFinally();
      _jspx_tagPool_form_label_path_cssStyle.reuse(_jspx_th_form_label_11);
    }
    return false;
  }

  private boolean _jspx_meth_form_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_2 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_2.setPageContext(_jspx_page_context);
    _jspx_th_form_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_2.setId("tariffDataYearFP");
    _jspx_th_form_select_2.setPath("tariffDataYearFP");
    int[] _jspx_push_body_count_form_select_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_2 = _jspx_th_form_select_2.doStartTag();
      if (_jspx_eval_form_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_form_options_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_2, _jspx_page_context, _jspx_push_body_count_form_select_2))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_form_select_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_2.doFinally();
      _jspx_tagPool_form_select_path_id.reuse(_jspx_th_form_select_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_2 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_2.setPageContext(_jspx_page_context);
    _jspx_th_form_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_2);
    _jspx_th_form_options_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListYear}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_2.setCssStyle("font-size: 2vmin;");
    int[] _jspx_push_body_count_form_options_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_2 = _jspx_th_form_options_2.doStartTag();
      if (_jspx_th_form_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_2.doFinally();
      _jspx_tagPool_form_options_items_cssStyle_nobody.reuse(_jspx_th_form_options_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_5.setPageContext(_jspx_page_context);
    _jspx_th_form_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_5.setId("tariffDataYearSP");
    _jspx_th_form_input_5.setPath("tariffDataYearSP");
    _jspx_th_form_input_5.setCssStyle("font-size: 2vmin;width: 2vw;");
    int[] _jspx_push_body_count_form_input_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_5 = _jspx_th_form_input_5.doStartTag();
      if (_jspx_th_form_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_5.doFinally();
      _jspx_tagPool_form_input_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_5);
    }
    return false;
  }
}
