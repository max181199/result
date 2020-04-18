<%@ page import="DAO.generatorOneServicePage" %>
<%@ page import="pageEntity.oneServicePage" %>
<%@ page import="ent.tariffEntity" %>
<%@ page import="DAO.generatorServicePage" %>
<%@ page import="pageEntity.servicePage" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 15.04.2020
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>oneService_EXT_</title>
</head>
<body>
<div style="display: flex">
    <div>
        <div style="margin-top: 0;width: 45vw; border: 1px solid black;margin-bottom: 0 ">
            <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Service Info </h2>
        </div>
        <div style="border: 1px solid black; width: 45vw ; margin-bottom: 0;margin-top: 0">
            <div style="margin-bottom: 2vh;margin-right: 0; margin-top: 2vh;margin-left: 2vw">
                <a href="/service" style="width: 4vw;margin: 0;">
                    <button style="height: 7vh;width: 10vw;margin:0;">
                        <p style="margin: 0;font-size: 2vmin;" > All Service </p>
                    </button>
                </a>
                <a href="<%= "/service/delete/" + request.getAttribute("absName")%>" style="width: 4vw;margin: 0;">
                    <button style="height: 7vh;width: 10vw;margin:0;">
                        <p style="margin: 0;font-size: 2vmin;" > Delete </p>
                    </button>
                </a>
                <a href="<%= "/service/tariff/add/" + request.getAttribute("absName")%>" style="width: 4vw;margin: 0;">
                    <button style="height: 7vh;width: 10vw;margin:0;">
                        <p style="margin: 0;font-size: 2vmin;" > Add Tariff </p>
                    </button>
                </a>
            </div>
            <div>
                <form:form method="POST"
                           modelAttribute="os_model">
                    <table>
                        <tr>
                            <td>
                                <form:label path="serviceName" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Name :: </form:label>
                                <form:input path="serviceName"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <form:label path="serviceType"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Type :: </form:label>
                                <form:input path="serviceType"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <form:label path="serviceState"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">State :: </form:label>
                                <form:checkbox path="serviceState"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <form:label path="serviceDescribe"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Describe :: </form:label>
                                <form:textarea path="serviceDescribe"  cssStyle="margin-right :  1vw; margin-left:1vw; max-width: 42vw; max-height: 58vh;margin-top: 2vh;font-size: 2vmin; width: 42vw;height: 58vh"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <input type="submit" value="Update" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                            </td>
                        </tr>
                    </table>
            </div>
        </div>
    </div>
    <div style="margin-left: 2vw">
        <div style="margin-top: 0;width: 50vw; border: 1px solid black;margin-bottom: 0 ">
            <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Tariff Info  </h2>
        </div>
        <div style="border: 1px solid black; width: 50vw ; margin-bottom: 0;margin-top: 0">
            <div>
                    <table>
                        <tr>
                            <td>
                                <form:label path="tariffId" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Id :: </form:label>
                                <form:input path="tariffId"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 3.5vmin"/>
                            </td>
                            <td>
                                <form:label path="tariffCost" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Cost :: </form:label>
                                <form:input path="tariffCost"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 5vw"/>
                            </td>
                            <td>
                                <form:label path="tariffValue" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Value :: </form:label>
                                <form:input path="tariffValue"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 5vw"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <form:label path="tariffActual"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Actual :: </form:label>
                                <form:checkbox path="tariffActual"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                            </td>
                            <td>
                                <form:label path="tariffDaypaymode"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">DP Mode :: </form:label>
                                <form:checkbox path="tariffDaypaymode"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <form:label path="tariffDataDay" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> День :: </form:label>
                                <form:select path="tariffDataDay">
                                    <form:options items="${ListDay}" cssStyle="font-size: 2vmin;" />
                                </form:select>
                            </td>
                            <td>
                                <form:label path="tariffDataMonth" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Месяц :: </form:label>
                                <form:select path="tariffDataMonth">
                                    <form:options items="${ListMonth}" cssStyle="font-size: 2vmin;" />
                                </form:select>
                            </td>
                            <td>
                                <form:label path="tariffDataYearFP" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Год :: </form:label>
                                <form:select path="tariffDataYearFP">
                                    <form:options items="${ListYear}" cssStyle="font-size: 2vmin;" />
                                </form:select>
                            </td>
                            <td>
                                <form:input path="tariffDataYearSP" cssStyle="font-size: 2vmin;width: 2vw;"/>
                            </td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td>
                                <input type="submit" value="Filter" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                            </td>
                        </tr>
                    </table>
                </form:form>


            </div>
        </div>
        <div style="border: 1px solid black; width: 50vw ; margin-bottom: 0;margin-top: 0;height: 76vh;max-height: 76vh;overflow-y: auto;">
            <%
                generatorServicePage hellgen = new generatorServicePage();
                hellgen.setServiceName((String) request.getAttribute("absName"));
                int alreadyUse = -1;
                for (servicePage sep : hellgen.getPageService()){
                    if(sep.getServiceTariff() != null){
                        alreadyUse=sep.getServiceTariff().getId();
            %>
                    <div style="display: flex">
                        <p style="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh;color: green;margin-bottom: 0"> Actual Tariff :: </p>
                        <a href="<%= "/service/tariff/" + alreadyUse%>" style="width: 1vw;margin: 0;">
                            <button style="height: 2.3vh;width: 10vw;margin-top: 2vh; margin-left: 2vw;">
                                <p style="margin: 0;font-size: 1.4vmin;" > Update Tariff </p>
                            </button>
                        </a>
                    </div>
                    <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 1vh;margin-bottom: 0"> ID :: <%= sep.getServiceTariff().getId()%></p>
                    <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> VALUE :: <%= sep.getServiceTariff().getValue()%></p>
                    <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> DP Mode :: <%= sep.getServiceTariff().getDaypaymode()%></p>
                    <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> Actual :: <%= sep.getServiceTariff().getState()%></p>
                     <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> Cost :: <%= sep.getServiceTariff().getCost()%></p>
                     <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> Create :: <%= sep.getServiceTariff().getCreate_time()%></p>
            <%}}%>


            <%
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


                gen.setServiceName((String) request.getAttribute("absName")); %>
            <p style="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh;color: red;margin-bottom: 0"> Other Tariff :: </p>
            <%
                for (oneServicePage osp : gen.getPageOneService() ){
                    for (tariffEntity tae : osp.getTariff()){
                        if (tae.getId() != alreadyUse){%>
                        <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 1vh;margin-bottom: 0"> ID :: <%= tae.getId()%></p>
                        <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> VALUE :: <%= tae.getValue()%></p>
                        <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> DP Mode :: <%= tae.getDaypaymode()%></p>
                        <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> Actual :: <%= tae.getState()%></p>
                        <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> Cost :: <%= tae.getCost()%></p>
                        <p style="margin-left: 2vw;font-size: 2vmin;margin-top: 0.4vh;margin-bottom: 0"> Create :: <%= tae.getCreate_time()%></p>
            <% } } }%>
        </div>
    </div>
</div>

</body>
</html>
