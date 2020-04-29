<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="DAO.findById" %>
<%@ page import="DAO.generatorConnectPage" %>
<%@ page import="pageEntity.connectPage" %>
<%@ page import="ent.historyServiceEntity" %>
<%@ page import="ent.serviceEntity" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: max
  Date: 16.04.2020
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connect_EXT_</title>
</head>
<body>
    <% findById dao = new findById();%>
    <div style="display: flex">
        <%
            generatorConnectPage gen = new generatorConnectPage();
            gen.setClinetBacklID((Integer) request.getAttribute("clientId"));
            for(connectPage cop : gen.getPageConnect() ){
        %>
        <div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-right: 4vw ">
                <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Actual service </h2>
            </div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-right: 4vw;overflow-y: auto;height: 92vh;max-height: 92vh; ">
                <%
                    for (serviceEntity see : cop.getAddServiceList()){%>
                    <a href="<%= "/service/" + see.getName()%>">
                        <p id="name" style="margin-left: 1vw;margin-right: 1vw;margin-top: 2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceName :: <%=see.getName()%> </p>
                    </a>
                    <p  id="type" style="margin-left: 1vw;margin-right: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceType :: <%=see.getType()%> </p>
                    <% for(historyServiceEntity hse : see.getHistoryService()){
                        if ( (hse.getEnd_time() == null) && (hse.getClient().getId() == (Integer) request.getAttribute("clientId")) ){
                    %>
                        <p id="value" style="margin-left: 1vw;margin-right: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceValue :: <%=hse.getState()%> </p>
                        <a href="<%="/connect/delete/" + request.getAttribute("clientId") + "/" + hse.getId()%>">
                            <button id="cancel" style="margin-top: 0.2vh;margin-bottom: 0.2vh;margin-left: 1vw;height: 3vmin;width: 5vw ">
                                <p style="font-size: 2vmin;margin: 0"> Cancel </p>
                            </button>
                        </a>
                <%}}%><%}%>
            </div>
        </div>
        <div>
            <a href="<%= "/client/person/" + dao.findClientById((Integer) request.getAttribute("clientId")).getName() %>">
                <button id="back" style="height: 6vh;width: 10vw;margin:0;">
                    <p style="margin: 0;font-size: 2vmin;" > Back </p>
                </button>
            </a>
        </div>
        <div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-left: 4vw ">
                <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Available service </h2>
            </div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-left: 4vw ">
                <h4 style="text-align: center;margin-top: 0.5vh;margin-bottom: 0.5vh"> Balance </h4>
            </div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-left: 4vw;overflow-y: auto;height: 17vh;max-height: 17vh;">
                <% for( serviceEntity see : cop.getAvaibleServiceList()){
                    if( see.getType().equals("BALANCE")){ %>
                <div style="display: flex">
                    <div>
                        <a href="<%= "/service/" + see.getName()%>">
                            <p id="balanceName" style="margin-left: 1vw;margin-right: 1vw;margin-top: 2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceName :: <%=see.getName()%> </p>
                        </a>
                        <p id="balanceType"  style="margin-left: 1vw;margin-right: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceType :: <%=see.getType()%> </p>
                    </div>
                    <form:form cssStyle="margin-top: 2vh" method="POST" modelAttribute="c_model" action="<%="/connect/add/" + request.getAttribute("clientId") + "/" + see.getId()%>">
                        <table>
                            <tr>
                                <td>
                                    <form:label path="customValue" cssStyle="margin-left: 2vw;font-size: 2vmin;margin-top: 4vh;margin-bottom: 0">Value :: </form:label>
                                    <form:input id="balanceValue" path="customValue"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 5vw;margin-bottom: 0"/>
                                </td>
                                <td>
                                    <input id="balanceAdd" type="submit" value="Add" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                                </td>
                            </tr>
                        </table>
                    </form:form>
                </div>
                <%}}%>
            </div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-left: 4vw ">
                <h4 style="text-align: center;margin-top: 0.5vh;margin-bottom: 0.5vh"> Service </h4>
            </div>
            <div style="margin-top: 0;width: 40vw; border: 1px solid black;margin-bottom: 0;margin-left: 4vw;overflow-y: auto;height: 68vh;max-height: 68vh;">
                <% for( serviceEntity see : cop.getAvaibleServiceList()){
                    if( !see.getType().equals("BALANCE")){ %>
                <div style="display: flex">
                    <div>
                        <a href="<%= "/service/" + see.getName()%>">
                            <p id="serviceName" style="margin-left: 1vw;margin-right: 1vw;margin-top: 2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceName :: <%=see.getName()%> </p>
                        </a>
                        <p id="serviceType" style="margin-left: 1vw;margin-right: 1vw;margin-top: 0.2vh;margin-bottom: 0.2vh;font-size: 2vmin"  > ServiceType :: <%=see.getType()%> </p>
                    </div>
                    <form:form cssStyle="margin-top: 2vh" method="POST" modelAttribute="c_model" action="<%="/connect/add/" + request.getAttribute("clientId") + "/" + see.getId()%>">
                        <table>
                            <tr>
                                <td>
                                    <form:label path="customValue" cssStyle="margin-left: 2vw;font-size: 2vmin;margin-top: 4vh;margin-bottom: 0">Value :: </form:label>
                                    <form:input id="serviceValue" path="customValue"  cssStyle="margin-right :  1vw;font-size: 2vmin;width: 5vw;margin-bottom: 0"/>
                                </td>
                                <td>
                                    <input id="serviceAdd" type="submit" value="Add" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                                </td>
                            </tr>
                        </table>
                    </form:form>
                </div>
                <%}}%>
            </div>
        </div>
        <%}%>
    </div>
</body>
</html>
