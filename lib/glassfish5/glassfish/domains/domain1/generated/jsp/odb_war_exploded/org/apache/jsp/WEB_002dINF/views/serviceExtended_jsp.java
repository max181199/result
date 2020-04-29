package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.generatorServicePage;
import pageEntity.servicePage;

public final class serviceExtended_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_label_path_cssStyle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_path_id_cssStyle_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_label_path_cssStyle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.release();
    _jspx_tagPool_form_label_path_cssStyle.release();
    _jspx_tagPool_form_form_modelAttribute_method_action.release();
    _jspx_tagPool_form_input_path_id_cssStyle_nobody.release();
    _jspx_tagPool_form_input_type_path_id_cssStyle_nobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Service_EXT_</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<dev style=\"display: flex; margin : 0; margin-bottom: 3vh;\" >\n");
      out.write("    <a href=\"/client/filter\">\n");
      out.write("        <button id=\"clientButton\" style=\"height: 7vh;width: 10vw;margin:0;\" id=\"clientButton\">\n");
      out.write("            <p  style=\"margin: 0;font-size: 2vmin;\"> Клиенты </p>\n");
      out.write("        </button>\n");
      out.write("    </a>\n");
      out.write("    <button style=\"height: 7vh;width: 10vw;margin:0;\" id=\"serviceButton\">\n");
      out.write("        <p style=\"margin: 0;font-size: 2vmin;\"> Сервисы </p>\n");
      out.write("    </button>\n");
      out.write("    <a href=\"/service/add\">\n");
      out.write("        <button  id=\"add\"  style=\"height: 7vh;width: 10vw;margin:0;\">\n");
      out.write("            <p style=\"margin: 0;font-size: 2vmin;\"> Добавить услугу </p>\n");
      out.write("        </button>\n");
      out.write("    </a>\n");
      out.write("</dev>\n");
      out.write("<div>\n");
      out.write("    ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("<div style=\"margin-right: 1vw;margin-left: 1vw;overflow-y: auto\">\n");
      out.write("    <table style=\"margin: 0\">\n");
      out.write("        <tr>\n");
      out.write("            <th style=\"margin:0;width: 38vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">Name</p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">Type</p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">State</p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 10vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">Tarrif Id</p>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            generatorServicePage gen = new generatorServicePage();
            if ( request.getAttribute("s_state").toString().equals("true")) {
                gen.setServiceActualFilter(true);
            } else {
                gen.setServiceActualFilter(false);
            }
            gen.setServiceName((String) request.getAttribute("s_name"));
            gen.setServiceType((String) request.getAttribute("s_type"));
            if ( request.getAttribute("s_taf_fil").toString().equals("true")) {
                gen.setServiceTariffIdFilter(true);
                gen.setServiceTariffId((Integer) request.getAttribute("s_taf"));
            } else {
                gen.setServiceTariffIdFilter(false);
            }

            for (servicePage sep : gen.getPageService()){ 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <th style=\"margin:0;width: 38vw;border: 1px solid black;background: white  \">\n");
      out.write("                <a href=\"");
      out.print( "/service/" + sep.getServiceName() );
      out.write("\">\n");
      out.write("                    <p id=\"serviceName\" style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\">");
      out.print( sep.getServiceName() );
      out.write("</p>\n");
      out.write("                </a>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: white  \">\n");
      out.write("                    <p style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\">");
      out.print(sep.getServiceType() );
      out.write("</p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: white  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\">\n");
      out.write("                    ");
      out.print( sep.isServiceActual());
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 10vw;border: 1px solid black;background: white  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\">\n");
      out.write("                    ");
      out.print( sep.getServiceTariff() == null ? "No" : sep.getServiceTariff().getId() );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</div>\n");
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
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setMethod("POST");
    _jspx_th_form_form_0.setAction("/service");
    _jspx_th_form_form_0.setModelAttribute("s_model");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <input  id=\"filter\" type=\"submit\" value=\"Submit\" style=\"font-size: 2vmin;margin-left: 1vw;\" />\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("    ");
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
      _jspx_tagPool_form_form_modelAttribute_method_action.reuse(_jspx_th_form_form_0);
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
    _jspx_th_form_label_0.setPath("actual");
    _jspx_th_form_label_0.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_0 = _jspx_th_form_label_0.doStartTag();
      if (_jspx_eval_form_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("State :: ");
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

  private boolean _jspx_meth_form_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_checkbox_0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_form_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_checkbox_0.setId("state");
    _jspx_th_form_checkbox_0.setPath("actual");
    _jspx_th_form_checkbox_0.setCssStyle("margin-right :  1vw;");
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

  private boolean _jspx_meth_form_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_1 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_1.setPageContext(_jspx_page_context);
    _jspx_th_form_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_1.setPath("name");
    _jspx_th_form_label_1.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_1 = _jspx_th_form_label_1.doStartTag();
      if (_jspx_eval_form_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Service Name :: ");
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

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setId("name");
    _jspx_th_form_input_0.setPath("name");
    _jspx_th_form_input_0.setCssStyle("font-size: 2vmin;width: 24vw;");
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

  private boolean _jspx_meth_form_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_2 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_2.setPageContext(_jspx_page_context);
    _jspx_th_form_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_2.setPath("type");
    _jspx_th_form_label_2.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_2 = _jspx_th_form_label_2.doStartTag();
      if (_jspx_eval_form_label_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Type :: ");
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

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setId("type");
    _jspx_th_form_input_1.setPath("type");
    _jspx_th_form_input_1.setCssStyle("font-size: 2vmin;width: 18vw;");
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

  private boolean _jspx_meth_form_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_3 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_3.setPageContext(_jspx_page_context);
    _jspx_th_form_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_3.setPath("taf");
    _jspx_th_form_label_3.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_3 = _jspx_th_form_label_3.doStartTag();
      if (_jspx_eval_form_label_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Id Tarrif :: ");
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

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setId("tariff");
    _jspx_th_form_input_2.setPath("taf");
    _jspx_th_form_input_2.setDynamicAttribute(null, "type", new String("Integer"));
    _jspx_th_form_input_2.setCssStyle("font-size: 2vmin;width: 18vw;");
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
      _jspx_tagPool_form_input_type_path_id_cssStyle_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }
}
