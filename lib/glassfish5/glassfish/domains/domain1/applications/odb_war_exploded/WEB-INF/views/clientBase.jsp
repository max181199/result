<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="pageEntity.clientPage" %>
<%@ page import="DAO.generatorClientPages" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: max
  Date: 12.04.2020
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client_B_</title>
</head>
<body>
    <dev style="display: flex; margin : 0; margin-bottom: 3vh;" >
        <button style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin;"> Клиенты </p>
        </button>
        <button style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin;"> Сервисы </p>
        </button>
        <button style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin"> Выход </p>
        </button>

    </dev>
    <div style="margin-right: 1vw;margin-left: 1vw;">
        <table style="margin: 0">
            <tr>
                <th style="margin:0;width: 48vw;border: 1px solid black;background: lightgrey  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">Name</p>
                </th>
                <th style="margin:0;width: 24vw;border: 1px solid black;background: lightgrey  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">Balance</p>
                </th>
                <th style="margin:0;width: 24vw;border: 1px solid black;background: lightgrey  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.5vh;margin-bottom:0.5vh;font-size:2.3vmin;">Debt</p>
                </th>
            </tr>

            <%
                generatorClientPages gen2 = new generatorClientPages();
                for (clientPage clp : gen2.getPageClient()){
                    %>
            <tr>
                <th style="margin:0;width: 48vw;border: 1px solid black;background: white  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;"><%= clp.getClientName() %></p>
                </th>
                <th style="margin:0;width: 24vw;border: 1px solid black;background: white  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;"><%=clp.getClientBalance() %></p>
                </th>
                <th style="margin:0;width: 24vw;border: 1px solid black;background: white  ">
                    <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;">
                        <%=clp.getClientDebt()==0?"No":(int)clp.getClientDebt()%>
                    </p>
                </th>
            </tr>  <%
                }
            %>

        </table>
    </div>
    </body>
</html>
