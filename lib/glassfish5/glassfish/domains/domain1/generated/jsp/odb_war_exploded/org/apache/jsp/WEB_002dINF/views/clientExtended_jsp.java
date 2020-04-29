package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.generatorClientPages;
import pageEntity.clientPage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public final class clientExtended_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_label_path_cssStyle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_options_items_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_id_cssStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path_id;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_label_path_cssStyle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_options_items_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_id_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.release();
    _jspx_tagPool_form_label_path_cssStyle.release();
    _jspx_tagPool_form_form_modelAttribute_method_action.release();
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Client_EXT_</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<dev style=\"display: flex; margin : 0; margin-bottom: 3vh;\" >\n");
      out.write("    <button style=\"height: 7vh;width: 10vw;margin:0;\" id=\"clientButton\">\n");
      out.write("        <p style=\"margin: 0;font-size: 2vmin;\"> Клиенты </p>\n");
      out.write("    </button>\n");
      out.write("    <a href=\"/service\">\n");
      out.write("        <button style=\"height: 7vh;width: 10vw;margin:0;\" id=\"serviceButton\">\n");
      out.write("            <p style=\"margin: 0;font-size: 2vmin;\"> Сервисы </p>\n");
      out.write("        </button>\n");
      out.write("    </a>\n");
      out.write("    <a href=\"/client/person/add\">\n");
      out.write("        <button style=\"height: 7vh;width: 10vw;margin:0;\" id=\"clientAdd\">\n");
      out.write("            <p style=\"margin: 0;font-size: 2vmin\"> Добавить клиента </p>\n");
      out.write("        </button>\n");
      out.write("    </a>\n");
      out.write("</dev>\n");
      out.write("<div>\n");
      out.write("    ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("<div style=\"margin-right: 1vw;margin-left: 1vw;\">\n");
      out.write("    <table style=\"margin: 0\">\n");
      out.write("        <tr>\n");
      out.write("            <th style=\"margin:0;width: 48vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">Name</p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">Balance</p>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: lightgrey  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;\">Debt</p>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");

            generatorClientPages gen2 = new generatorClientPages();
           // out.print(request.getAttribute("debt"));
            if ( request.getAttribute("debt").equals("true") ){
                gen2.setDebt(true);
            }
            if ( request.getAttribute("balance").equals("true") ){
                gen2.setBalance(2);
            }
            gen2.setClientName((String) request.getAttribute("name"));
            gen2.setServiceName((String) request.getAttribute("service"));

            if ( !request.getAttribute("dateUp").equals("--")){
                SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
                Date parsingDate = new Date();
                try {
                    parsingDate = ft.parse( (String) request.getAttribute("dateUp"));
                    //out.print(parsingDate);
                }catch (ParseException e) {
                    parsingDate = new Date();
                }
                gen2.setServiceTopDate(parsingDate);
            }
            if (!request.getAttribute("dateDown").equals("--")){
                SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
                Date parsingDate = new Date();
                try {
                    parsingDate = ft.parse((String) request.getAttribute("dateDown"));
                    //out.print(parsingDate);
                }catch (ParseException e) {
                    parsingDate = new Date();
                }
                gen2.setServiceDownDate(parsingDate);
            }


            for (clientPage clp : gen2.getPageClient()){
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <th style=\"margin:0;width: 48vw;border: 1px solid black;background: white  \">\n");
      out.write("              <a href=\"");
      out.print( "/client/person/" + clp.getClientName() );
      out.write("\">\n");
      out.write("                  <p style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\" id=\"");
      out.print( "clientName");
      out.write('"');
      out.write('>');
      out.print( clp.getClientName() );
      out.write("</p>\n");
      out.write("              </a>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: white  \">\n");
      out.write("                <a href=\"");
      out.print( "/client/balance/" + clp.getClientName() );
      out.write("\">\n");
      out.write("                     <p id=\"balance\" style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\">");
      out.print(clp.getClientBalance() );
      out.write("</p>\n");
      out.write("                </a>\n");
      out.write("            </th>\n");
      out.write("            <th style=\"margin:0;width: 24vw;border: 1px solid black;background: white  \">\n");
      out.write("                <p style=\"margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;\">\n");
      out.write("                    ");
      out.print(clp.getClientDebt()==0?"No":(int)clp.getClientDebt());
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </th>\n");
      out.write("        </tr>  ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
    _jspx_th_form_form_0.setAction("/client/filter");
    _jspx_th_form_form_0.setModelAttribute("c_model");
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
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_checkbox_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <td>\n");
          out.write("                ");
          if (_jspx_meth_form_label_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("            </td>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                        ");
          if (_jspx_meth_form_label_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_form_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_select_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <td>\n");
          out.write("                ");
          if (_jspx_meth_form_label_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("            </td>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_select_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_select_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_label_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_select_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"submit\" id=\"filterButton\" value=\"Submit\" style=\"font-size: 2vmin;margin-left: 1vw;\" />\n");
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
    _jspx_th_form_label_0.setPath("clientDebt");
    _jspx_th_form_label_0.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_0 = _jspx_th_form_label_0.doStartTag();
      if (_jspx_eval_form_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Debt :: ");
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
    _jspx_th_form_checkbox_0.setPath("clientDebt");
    _jspx_th_form_checkbox_0.setId("clientDebt");
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
    _jspx_th_form_label_1.setPath("clientBalance");
    _jspx_th_form_label_1.setCssStyle("margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh");
    int[] _jspx_push_body_count_form_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_1 = _jspx_th_form_label_1.doStartTag();
      if (_jspx_eval_form_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Balance :: ");
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

  private boolean _jspx_meth_form_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_checkbox_1 = (org.springframework.web.servlet.tags.form.CheckboxTag) _jspx_tagPool_form_checkbox_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_form_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_checkbox_1.setPath("clientBalance");
    _jspx_th_form_checkbox_1.setId("clientBalance");
    _jspx_th_form_checkbox_1.setCssStyle("margin-right :  1vw;");
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

  private boolean _jspx_meth_form_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_2 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_2.setPageContext(_jspx_page_context);
    _jspx_th_form_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_2.setPath("clientName");
    _jspx_th_form_label_2.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_2 = _jspx_th_form_label_2.doStartTag();
      if (_jspx_eval_form_label_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Name :: ");
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

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("clientName");
    _jspx_th_form_input_0.setId("clientNameInput");
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

  private boolean _jspx_meth_form_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_3 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_3.setPageContext(_jspx_page_context);
    _jspx_th_form_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_3.setPath("serviceName");
    _jspx_th_form_label_3.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_3 = _jspx_th_form_label_3.doStartTag();
      if (_jspx_eval_form_label_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Service :: ");
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

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setPath("serviceName");
    _jspx_th_form_input_1.setId("serviceNameInput");
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

  private boolean _jspx_meth_form_label_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_4 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_4.setPageContext(_jspx_page_context);
    _jspx_th_form_label_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_4.setPath("downDay");
    _jspx_th_form_label_4.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_4 = _jspx_th_form_label_4.doStartTag();
      if (_jspx_eval_form_label_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" Нижняя дата :: ");
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

  private boolean _jspx_meth_form_label_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_5 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_5.setPageContext(_jspx_page_context);
    _jspx_th_form_label_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_5.setPath("downDay");
    _jspx_th_form_label_5.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_5 = _jspx_th_form_label_5.doStartTag();
      if (_jspx_eval_form_label_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" День :: ");
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

  private boolean _jspx_meth_form_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_0.setPageContext(_jspx_page_context);
    _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_0.setId("downDateDay");
    _jspx_th_form_select_0.setPath("downDay");
    int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
      if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_form_options_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_0, _jspx_page_context, _jspx_push_body_count_form_select_0))
            return true;
          out.write("\n");
          out.write("                        ");
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

  private boolean _jspx_meth_form_label_6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_6 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_6.setPageContext(_jspx_page_context);
    _jspx_th_form_label_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_6.setPath("downMonth");
    _jspx_th_form_label_6.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_6 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_6 = _jspx_th_form_label_6.doStartTag();
      if (_jspx_eval_form_label_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" Месяц :: ");
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

  private boolean _jspx_meth_form_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_1 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_1.setPageContext(_jspx_page_context);
    _jspx_th_form_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_1.setPath("downMonth");
    _jspx_th_form_select_1.setId("downDateMonth");
    int[] _jspx_push_body_count_form_select_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_1 = _jspx_th_form_select_1.doStartTag();
      if (_jspx_eval_form_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_form_options_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_1, _jspx_page_context, _jspx_push_body_count_form_select_1))
            return true;
          out.write("\n");
          out.write("                    ");
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

  private boolean _jspx_meth_form_label_7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_7 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_7.setPageContext(_jspx_page_context);
    _jspx_th_form_label_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_7.setPath("downYearDl");
    _jspx_th_form_label_7.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_7 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_7 = _jspx_th_form_label_7.doStartTag();
      if (_jspx_eval_form_label_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" Год :: ");
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

  private boolean _jspx_meth_form_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_2 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_2.setPageContext(_jspx_page_context);
    _jspx_th_form_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_2.setPath("downYearDl");
    _jspx_th_form_select_2.setId("downDateYearFP");
    int[] _jspx_push_body_count_form_select_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_2 = _jspx_th_form_select_2.doStartTag();
      if (_jspx_eval_form_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_form_options_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_2, _jspx_page_context, _jspx_push_body_count_form_select_2))
            return true;
          out.write("\n");
          out.write("                    ");
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

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_id_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setPath("downYearFl");
    _jspx_th_form_input_2.setId("downDateYearSP");
    _jspx_th_form_input_2.setCssStyle("font-size: 2vmin;width: 2vw;");
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

  private boolean _jspx_meth_form_label_8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_8 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_8.setPageContext(_jspx_page_context);
    _jspx_th_form_label_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_8.setPath("upDay");
    _jspx_th_form_label_8.setCssStyle("margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin");
    int[] _jspx_push_body_count_form_label_8 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_8 = _jspx_th_form_label_8.doStartTag();
      if (_jspx_eval_form_label_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" Верхняя дата :: ");
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

  private boolean _jspx_meth_form_label_9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_9 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path_cssStyle.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_9.setPageContext(_jspx_page_context);
    _jspx_th_form_label_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_9.setPath("upDay");
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

  private boolean _jspx_meth_form_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_3 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_3.setPageContext(_jspx_page_context);
    _jspx_th_form_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_3.setPath("upDay");
    _jspx_th_form_select_3.setId("upDateDay");
    int[] _jspx_push_body_count_form_select_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_3 = _jspx_th_form_select_3.doStartTag();
      if (_jspx_eval_form_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_form_options_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_3, _jspx_page_context, _jspx_push_body_count_form_select_3))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_form_select_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_3.doFinally();
      _jspx_tagPool_form_select_path_id.reuse(_jspx_th_form_select_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_3 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_3.setPageContext(_jspx_page_context);
    _jspx_th_form_options_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_3);
    _jspx_th_form_options_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListDay}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_3.setCssStyle("font-size: 2vmin;");
    int[] _jspx_push_body_count_form_options_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_3 = _jspx_th_form_options_3.doStartTag();
      if (_jspx_th_form_options_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_3.doFinally();
      _jspx_tagPool_form_options_items_cssStyle_nobody.reuse(_jspx_th_form_options_3);
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
    _jspx_th_form_label_10.setPath("upMonth");
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

  private boolean _jspx_meth_form_select_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_4 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_4.setPageContext(_jspx_page_context);
    _jspx_th_form_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_4.setPath("upMonth");
    _jspx_th_form_select_4.setId("upDateMonth");
    int[] _jspx_push_body_count_form_select_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_4 = _jspx_th_form_select_4.doStartTag();
      if (_jspx_eval_form_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_form_options_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_4, _jspx_page_context, _jspx_push_body_count_form_select_4))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_form_select_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_4.doFinally();
      _jspx_tagPool_form_select_path_id.reuse(_jspx_th_form_select_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_4 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_4.setPageContext(_jspx_page_context);
    _jspx_th_form_options_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_4);
    _jspx_th_form_options_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListMonth}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_4.setCssStyle("font-size: 2vmin;");
    int[] _jspx_push_body_count_form_options_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_4 = _jspx_th_form_options_4.doStartTag();
      if (_jspx_th_form_options_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_4.doFinally();
      _jspx_tagPool_form_options_items_cssStyle_nobody.reuse(_jspx_th_form_options_4);
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
    _jspx_th_form_label_11.setPath("upYearDl");
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

  private boolean _jspx_meth_form_select_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_5 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_id.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_5.setPageContext(_jspx_page_context);
    _jspx_th_form_select_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_5.setPath("upYearDl");
    _jspx_th_form_select_5.setId("upDateYearFP");
    int[] _jspx_push_body_count_form_select_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_5 = _jspx_th_form_select_5.doStartTag();
      if (_jspx_eval_form_select_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_form_options_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_5, _jspx_page_context, _jspx_push_body_count_form_select_5))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_form_select_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_select_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_select_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_select_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_select_5.doFinally();
      _jspx_tagPool_form_select_path_id.reuse(_jspx_th_form_select_5);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_5 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_cssStyle_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_5.setPageContext(_jspx_page_context);
    _jspx_th_form_options_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_5);
    _jspx_th_form_options_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListYear}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_options_5.setCssStyle("font-size: 2vmin;");
    int[] _jspx_push_body_count_form_options_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_5 = _jspx_th_form_options_5.doStartTag();
      if (_jspx_th_form_options_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_5.doFinally();
      _jspx_tagPool_form_options_items_cssStyle_nobody.reuse(_jspx_th_form_options_5);
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
    _jspx_th_form_input_3.setPath("upYearFl");
    _jspx_th_form_input_3.setId("upDateYearSP");
    _jspx_th_form_input_3.setCssStyle("font-size: 2vmin;width: 2vw;");
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
}
