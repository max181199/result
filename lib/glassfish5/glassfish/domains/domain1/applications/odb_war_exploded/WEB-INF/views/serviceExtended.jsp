<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="DAO.generatorServicePage" %>
<%@ page import="pageEntity.servicePage" %><%--
  Created by IntelliJ IDEA.
  User: max
  Date: 15.04.2020
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Service_EXT_</title>
</head>
<body>
<dev style="display: flex; margin : 0; margin-bottom: 3vh;" >
    <a href="/client/filter">
        <button id="clientButton" style="height: 7vh;width: 10vw;margin:0;" id="clientButton">
            <p  style="margin: 0;font-size: 2vmin;"> Клиенты </p>
        </button>
    </a>
    <button style="height: 7vh;width: 10vw;margin:0;" id="serviceButton">
        <p style="margin: 0;font-size: 2vmin;"> Сервисы </p>
    </button>
    <a href="/service/add">
        <button  id="add"  style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin;"> Добавить услугу </p>
        </button>
    </a>
</dev>
<div>
    <form:form method="POST" action="/service"
               modelAttribute="s_model">
        <table>
            <tr>
                <td>
                    <form:label path="actual" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">State :: </form:label>
                    <form:checkbox id="state" path="actual" cssStyle="margin-right :  1vw;"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="name" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin">Service Name :: </form:label>
                    <form:input id="name" path="name" cssStyle="font-size: 2vmin;width: 24vw;"/>
                </td>
                <td>
                    <form:label path="type" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin">Type :: </form:label>
                    <form:input id="type" path="type" cssStyle="font-size: 2vmin;width: 18vw;"/>
                </td>
                <td>
                    <form:label path="taf" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin">Id Tarrif :: </form:label>
                    <form:input id="tariff" path="taf" type="Integer" cssStyle="font-size: 2vmin;width: 18vw;"/>
                </td>
            </tr>
        <table>
            <tr>
                <td>
                    <input  id="filter" type="submit" value="Submit" style="font-size: 2vmin;margin-left: 1vw;" />
                </td>
            </tr>
        </table>
    </form:form>
</div>
<div style="margin-right: 1vw;margin-left: 1vw;overflow-y: auto">
    <table style="margin: 0">
        <tr>
            <th style="margin:0;width: 38vw;border: 1px solid black;background: lightgrey  ">
                <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">Name</p>
            </th>
            <th style="margin:0;width: 24vw;border: 1px solid black;background: lightgrey  ">
                <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">Type</p>
            </th>
            <th style="margin:0;width: 24vw;border: 1px solid black;background: lightgrey  ">
                <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">State</p>
            </th>
            <th style="margin:0;width: 10vw;border: 1px solid black;background: lightgrey  ">
                <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">Tarrif Id</p>
            </th>
        </tr>
        <%
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

            for (servicePage sep : gen.getPageService()){ %>
        <tr>
            <th style="margin:0;width: 38vw;border: 1px solid black;background: white  ">
                <a href="<%= "/service/" + sep.getServiceName() %>">
                    <p id="serviceName" style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;"><%= sep.getServiceName() %></p>
                </a>
            <th style="margin:0;width: 24vw;border: 1px solid black;background: white  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;"><%=sep.getServiceType() %></p>
            </th>
            <th style="margin:0;width: 24vw;border: 1px solid black;background: white  ">
                <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;">
                    <%= sep.isServiceActual()%>
                </p>
            </th>
            <th style="margin:0;width: 10vw;border: 1px solid black;background: white  ">
                <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;">
                    <%= sep.getServiceTariff() == null ? "No" : sep.getServiceTariff().getId() %>
                </p>
            </th>
        </tr>

        <% } %>
    </table>

</div>
</body>
</html>
