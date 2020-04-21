<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="DAO.generatorOneClientPage" %>
<%@ page import="pageEntity.oneClientPage" %>
<%@ page import="java.util.List" %>
<%@ page import="ent.*" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: max
  Date: 14.04.2020
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>oneClient_EXT_</title>
</head>
<body>
    <%  generatorOneClientPage gen = new generatorOneClientPage();
        gen.setClientName((String) request.getAttribute("name"));
        List<oneClientPage> tr = gen.getPageOneClient();
        oneClientPage ocp = null;
        for ( oneClientPage ent : tr){
           ocp = ent;
        }

    %>

<div style="display: flex;overflow-x: auto;">
    <div>
        <div style="margin-top: 0;width: 45vw; border: 1px solid black;margin-bottom: 0 ">
            <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Client Info </h2>
        </div>
        <div style="border: 1px solid black; width: 45vw ; margin-bottom: 0;margin-top: 0">
         <div style="margin-bottom: 2vh;margin-right: 1vh; margin-top: 2vh;margin-left: 2vw">
            <a href="/client/filter" style="width: 4vw;margin: 0;">
                <button  id="back" style="height: 7vh;width: 10vw;margin:0;">
                   <p style="margin: 0;font-size: 2vmin;" > Back </p>
                </button>
            </a>
            <a href="<%= "/client/person/delete/" + ocp.getName()%>" style="width: 4vw;margin: 0;">
                <button id="delete" style="height: 7vh;width: 10vw;margin-left: 0vw">
                    <p style="margin: 0;font-size: 2vmin;" > Delete </p>
                </button>
            </a>
            <a href="<%= "/contact/add/" + ocp.getName()%>" style="width: 4vw;margin: 0;">
                <button style="height: 7vh;width: 10vw;margin-left: 0vw;margin-right: 0vw">
                    <p style="margin: 0;font-size: 2vmin;" > AddContact </p>
                </button>
            </a>
             <a href="<%= "/connect/" + ocp.getSecretClientId()%>">
                 <button style="height: 7vh;width: 10vw;margin-left: 0vw;margin-right: 0vw">
                     <p style="margin: 0;font-size: 2vmin;" > Config service </p>
                 </button>
             </a>


        </div>
        <div>
            <form:form method="POST"
                       modelAttribute="o_model">
                <table>
                    <tr>
                        <td>
                            <form:label path="clientName" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Name :: </form:label>
                            <form:input path="clientName" id="clientName"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                        </td>
                    </tr>
                </table>
                <table>
                    <tr>
                        <td>
                            <form:label path="max_credit_count" type="float" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Max Credit Count :: </form:label>
                            <form:input path="max_credit_count" id="mcCount" type="float" cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                        </td>
                    </tr>
                </table>
                <table>
                    <tr>
                        <td>
                            <form:label path="max_credit_day" type="float" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Max Credit Day :: </form:label>
                            <form:input path="max_credit_day" id="mcDay" type="float"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                        </td>
                    </tr>
                </table>
                <table>
                    <tr>
                        <td>
                            <input type="submit" value="Update" id="update" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                        </td>
                    </tr>
                </table>
        </div>
    </div>
    <div style="margin-top: 2vh;width: 45vw; border: 1px solid black ">
        <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Contact Info </h2>
    </div>
        <div style="border: 1px solid black; width: 45vw ;max-height: 55vh;height: 55vh; margin-bottom: 0;margin-top: 0;overflow-y: auto;">
            <% for (contactEntity cee : ocp.getContact()){%>
            <a href="<%= "/contact/" + cee.getName()%>">
                <p id="contactName" style="margin-left : 1vw;margin-right: 0; margin-top:2vh;margin-bottom:0.2vh;font-size:2vmin;"> ContactName ::  <%= cee.getName()%>  </p>
            </a>
            <% for (addresEntity ade : cee.getAddres()){%>
            <p id="contactAddress" style="margin-left : 1vw;margin-right: 0; margin-top: 0.2vh;margin-bottom:0.2vh;font-size:2vmin;"> ContactAddres ::  <%= ade.getAddres()%>  </p>
            <%}%>
            <% for (emailEntity eme : cee.getEmail()){%>
            <p id="contactEmail" style="margin-left : 1vw;margin-right: 0; margin-top: 0.2vh;margin-bottom:0.2vh;font-size:2vmin;"> ContactEmail ::  <%= eme.getEmail()%>  </p>
            <%}%>
            <% for (phoneEntity phe : cee.getPhone()){%>
            <p  id="contactPhone" style="margin-left : 1vw;margin-right: 0; margin-top: 0.2vh;margin-bottom:0.2vh;font-size:2vmin;"> ContactPhone ::  <%= phe.getPhone()%>  </p>
            <%}%>
            <%}  %>
        </div>
    </div>
    <div>
        <div style="margin-top: 0vh;width: 52vw; border: 1px solid black;margin-left: 1vw ">
            <p style="text-align: center;margin-top: 1vh;margin-bottom: 0.5vh;margin-top: 1vh;font-size: 2.5vmin"> Service History </p>
        </div>
        <div style="margin-top: 0vh;width: 52vw; border: 1px solid black;margin-left: 1vw ">
            <table>
                <tr>
                    <td>
                        <form:label path="serviceName" cssStyle="margin-left: 1vw;font-size: 2vmin;margin-top: 1vh;width: 13vw">ServiceName :: </form:label>
                        <form:input path="serviceName" id="serviceNameField"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 30.5vmin"/>
                    </td>
                    <td>
                        <form:label path="serviceState" cssStyle="margin-left: 1vw;font-size: 2vmin;margin-top: 1vh">ServiceState :: </form:label>
                        <form:input path="serviceState" id="serviceStateField"  type="float"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 5vw"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <p style="margin-left: 1vw;font-size: 2vmin;margin: 0;margin-left: 1vw"> Нижняя дата :: </p>
                </tr>
                <tr>
                    <td>
                        <form:label path="downDay" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> День :: </form:label>
                        <form:select path="downDay" id="downDateDay">
                            <form:options items="${ListDay}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:label path="downMonth"  cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> Месяц :: </form:label>
                        <form:select path="downMonth" id="downDateMonth">
                            <form:options items="${ListMonth}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:label path="downYearFP"  cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> Год :: </form:label>
                        <form:select path="downYearFP" id="downDateYearFP">
                            <form:options items="${ListYear}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:input path="downYearSP" id="downDateYearSP" cssStyle="font-size: 2vmin;width: 2vw;"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <p style="margin-left: 1vw;font-size: 2vmin;margin: 0;margin-left: 1vw"> Верхняя дата :: </p>
                </tr>
                <tr>
                    <td>
                        <form:label path="upDay" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> День :: </form:label>
                        <form:select path="upDay" id="upDateDay">
                            <form:options items="${ListDay}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:label path="upMonth" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> Месяц :: </form:label>
                        <form:select path="upMonth" id="upDateMonth">
                            <form:options items="${ListMonth}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:label path="upYearFP" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> Год :: </form:label>
                        <form:select path="upYearFP" id="upDateYearFP">
                            <form:options items="${ListYear}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:input path="upYearSP" id="upDateYearSP" cssStyle="font-size: 2vmin;width: 2vw;"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td>
                        <input type="submit" id="filter" value="Filter" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                    </td>
                </tr>
            </table>
            </form:form>
        </div>
        <div style="margin-top: 0vh;width: 52vw;overflow-y: auto;max-height: 71.5vh;height: 71.5vh; border: 1px solid black;margin-left: 1vw ">
         <% generatorOneClientPage hellgen = new generatorOneClientPage();
            hellgen.setClientName((String) request.getAttribute("name"));
            hellgen.setServiceServiceName((String) request.getAttribute("serviceName"));
            hellgen.setServiceState((Float) request.getAttribute("serviceState"));
            if ((Float) request.getAttribute("serviceState") != 0){
                hellgen.setServiceStateFilter(true);
            }
            else{
                hellgen.setServiceStateFilter(false);
            }

             if (  request.getAttribute("downDay").toString().equals("--") || request.getAttribute("downMonth").toString().equals("--") ||
                     request.getAttribute("downYearFP").toString().equals("--") || request.getAttribute("downYearSP").toString().equals("--")
             ){
                 hellgen.setServiceBottomDateFilter(false);
             }
             else {
                 String year = request.getAttribute("downYearFP").toString() + request.getAttribute("downYearSP").toString();
                 String month = request.getAttribute("downMonth").toString();
                 String day =  request.getAttribute("downDay").toString();
                 Calendar calendar = new GregorianCalendar(Integer.valueOf(year) , Integer.valueOf(month)-1 , Integer.valueOf(day)-1);
//                    out.println(calendar);
//                    out.println(calendar.getTime());
//                    out.println(calendar.getTime().getTime());
//                    out.println(new Date().getTime());
                 hellgen.setServiceBottomDate(calendar.getTime());
                 hellgen.setServiceBottomDateFilter(true);
             }

             if (  request.getAttribute("upDay").toString().equals("--") || request.getAttribute("upMonth").toString().equals("--") ||
                     request.getAttribute("upYearFP").toString().equals("--") || request.getAttribute("upYearSP").toString().equals("--")
             ){
                 hellgen.setServiceTopDateFilter(false);
             }
             else {
                 String year = request.getAttribute("upYearFP").toString() + request.getAttribute("upYearSP").toString();
                 String month = request.getAttribute("upMonth").toString();
                 String day =  request.getAttribute("upDay").toString();
                 Calendar calendar = new GregorianCalendar(Integer.valueOf(year) , Integer.valueOf(month)-1 , Integer.valueOf(day)-1);
//                    out.println(calendar);
//                    out.println(calendar.getTime());
//                    out.println(calendar.getTime().getTime());
//                    out.println(new Date().getTime());
                 hellgen.setServiceTopDate(calendar.getTime());
                 hellgen.setServiceTopDateFilter(true);
             }

            for (oneClientPage opa : hellgen.getPageOneClient()){
                for (historyServiceEntity hes : opa.getServiceHistory()){ %>
                <a href="<%= "/service/" + hes.getService().getName()%>">
                    <p id="serviceName" style="margin-left: 1vw;margin-top: 1vh;margin-bottom: 0.2vh;font-size: 2vmin"> ServiceName :: <%=hes.getService().getName()%> </p>
                </a>
                <p id="serviceState" style="margin-left: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"> ServiceState :: <%=hes.getState()%> </p>
                <p id="serviceBegin" style="margin-left: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"> ServiceBegin :: <%=hes.getBegin_time()%> </p>
                <p id="serviceEnd" style="margin-left: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"> ServiceEnd :: <%=hes.getEnd_time() == null? "---":hes.getEnd_time()%> </p>
          <%}}%>
        </div>
    </div>

</div>
</body>
</html>
