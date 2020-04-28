<%@ page import="DAO.generatorOneClientPage" %>
<%@ page import="pageEntity.oneClientPage" %>
<%@ page import="ent.historyBalanceEntity" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 16.04.2020
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>balance_EXT_</title>
</head>
<body>
<div>
    <div style="margin-top: 0vh;width: 52vw; border: 1px solid black;margin-left: 1vw ">
        <p style="text-align: center;margin-top: 1vh;margin-bottom: 0.5vh;margin-top: 1vh;font-size: 2.5vmin"> Balance History </p>
    </div>
    <div style="margin-top: 0vh;width: 52vw; border: 1px solid black;margin-left: 1vw ">
        <a href="/client/filter" style="width: 4vw;margin: 0;">
            <button id="back" style="height: 7vh;width: 10vw;margin:0;">
                <p style="margin: 0;font-size: 2vmin;" > Back </p>
            </button>
        </a>
        <form:form method="POST"
           modelAttribute="b_model">
            <table>
                <tr>
                    <td>
                        <form:label path="balanceName" cssStyle="margin-left: 1vw;font-size: 2vmin;margin-top: 2vh">Balance Name :: </form:label>
                        <form:input id="name" path="balanceName"  cssStyle="margin-right :  1vw;font-size: 2vmin;margin-top: 2vh"/>
                    </td>
                    <td>
                        <form:label path="balanceCount" cssStyle="margin-left: 1vw;font-size: 2vmin;margin-top: 2vh">Balance Count :: </form:label>
                        <form:input id="count" type="float" path="balanceCount"  cssStyle="margin-right :  1vw;font-size: 2vmin; width: 5vw;margin-top: 2vh"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <p style="margin-left: 1vw;font-size: 2vmin;margin: 0;margin-left: 1.2vw"> Верхняя дата :: </p>
                </tr>
                <tr>
                    <td>
                        <form:label path="balanceDay" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> День :: </form:label>
                        <form:select id="balanceDay" path="balanceDay">
                            <form:options items="${ListDay}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:label path="balanceMonth" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> Месяц :: </form:label>
                        <form:select id="balanceMonth" path="balanceMonth">
                            <form:options items="${ListMonth}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:label path="balanceYearFP" cssStyle="margin-top: 1vh;margin-bottom: 1vh;margin-left: 1vw; font-size: 2vmin"> Год :: </form:label>
                        <form:select id="balanceYearFP" path="balanceYearFP">
                            <form:options items="${ListYear}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                    </td>
                    <td>
                        <form:input id="balanceYearSP" path="balanceYearSP" cssStyle="font-size: 2vmin;width: 2vw;"/>
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
    <div style="margin-top: 0vh;width: 52vw; border: 1px solid black;margin-left: 1vw;overflow-y: auto;max-height: 67vh;height: 67vh ">
        <%
            generatorOneClientPage gen = new generatorOneClientPage();
            gen.setClientName((String) request.getAttribute("absName"));
            gen.setBalanceNameService((String) request.getAttribute("balanceName"));
            gen.setBalanceCount((Float) request.getAttribute("balanceCount"));
            if ( (Float) request.getAttribute("balanceCount") == 0 ){
                gen.setBalanceCountFilter(false);
            }
            else {
                gen.setBalanceCountFilter(true);
            }

            if (  request.getAttribute("balanceDay").toString().equals("--") || request.getAttribute("balanceMonth").toString().equals("--") ||
                    request.getAttribute("balanceYearFP").toString().equals("--") || request.getAttribute("balanceYearSP").toString().equals("--")
            ){
                gen.setBalanceDateFilter(false);
            }
            else {
                String year = request.getAttribute("balanceYearFP").toString() + request.getAttribute("balanceYearSP").toString();
                String month = request.getAttribute("balanceMonth").toString();
                String day =  request.getAttribute("balanceDay").toString();
                Calendar calendar = new GregorianCalendar(Integer.valueOf(year) , Integer.valueOf(month)-1 , Integer.valueOf(day)-1);
//                    out.println(calendar);
//                    out.println(calendar.getTime());
//                    out.println(calendar.getTime().getTime());
//                    out.println(new Date().getTime());
                gen.setBalanceDate(calendar.getTime());
                gen.setBalanceDateFilter(true);
            }

            for (oneClientPage ocp : gen.getPageOneClient()){
                for (historyBalanceEntity hbe : ocp.getBalanceHistory()){ %>
            <a href="<%= "/service/" + hbe.getService().getName()%>">
                <p  id="balanceName"  style="margin-left: 1vw;margin-top: 1vh;margin-bottom: 0.2vh;font-size: 2vmin"> BalanceName :: <%=hbe.getService().getName()%> </p>
            </a>
            <p id="balanceCount" style="margin-left: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"> BalanceCount :: <%=hbe.getSumm()%> </p>
            <p id="balanceTime" style="margin-left: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"> BalanceTimeTransaction :: <%=hbe.getOp_time()%> </p>
         <%} }%>
    </div>


</div>


</body>
</html>
