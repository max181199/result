<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="DAO.generatorClientPages" %>
<%@ page import="pageEntity.clientPage" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %><%--
  Created by IntelliJ IDEA.
  User: max
  Date: 12.04.2020
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client_EXT_</title>
</head>
<body>
<dev style="display: flex; margin : 0; margin-bottom: 3vh;" >
    <button style="height: 7vh;width: 10vw;margin:0;" id="clientButton">
        <p style="margin: 0;font-size: 2vmin;"> Клиенты </p>
    </button>
    <a href="/service">
        <button style="height: 7vh;width: 10vw;margin:0;" id="serviceButton">
            <p style="margin: 0;font-size: 2vmin;"> Сервисы </p>
        </button>
    </a>
    <a href="/client/person/add">
        <button style="height: 7vh;width: 10vw;margin:0;" id="clientAdd">
            <p style="margin: 0;font-size: 2vmin"> Добавить клиента </p>
        </button>
    </a>
</dev>
<div>
    <form:form method="POST" action="/client/filter"
               modelAttribute="c_model">
        <table>
            <tr>
                <td>
                    <form:label path="clientDebt" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Debt :: </form:label>
                    <form:checkbox path="clientDebt" id="clientDebt" cssStyle="margin-right :  1vw;"/>
                </td>
                <td>
                    <form:label path="clientBalance" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Balance :: </form:label>
                    <form:checkbox path="clientBalance" id="clientBalance"  cssStyle="margin-right :  1vw;"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="clientName" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin">Name :: </form:label>
                    <form:input path="clientName" id="clientNameInput" cssStyle="font-size: 2vmin;width: 24vw;"/>
                </td>
                <td>
                    <form:label path="serviceName" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin">Service :: </form:label>
                    <form:input path="serviceName" id="serviceNameInput" cssStyle="font-size: 2vmin;width: 18vw;"/>
                </td>
                <td>

                </td>
            </tr>
        </table>
        <table>
            <td>
                <form:label path="downDay" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Нижняя дата :: </form:label>
            </td>
        </table>
        <table>
            <tr>
                <td>
                        <form:label path="downDay" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> День :: </form:label>
                        <form:select id="downDateDay" path="downDay">
                            <form:options items="${ListDay}" cssStyle="font-size: 2vmin;" />
                        </form:select>
                </td>
                <td>
                    <form:label path="downMonth" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Месяц :: </form:label>
                    <form:select path="downMonth" id="downDateMonth">
                        <form:options items="${ListMonth}" cssStyle="font-size: 2vmin;" />
                    </form:select>
                </td>
                <td>
                    <form:label path="downYearDl" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Год :: </form:label>
                    <form:select path="downYearDl" id="downDateYearFP">
                        <form:options items="${ListYear}" cssStyle="font-size: 2vmin;" />
                    </form:select>
                </td>
                <td>
                    <form:input path="downYearFl" id="downDateYearSP" cssStyle="font-size: 2vmin;width: 2vw;"/>
                </td>
            </tr>
        </table>
        <table>
            <td>
                <form:label path="upDay" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Верхняя дата :: </form:label>
            </td>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="upDay" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> День :: </form:label>
                    <form:select path="upDay" id="upDateDay">
                        <form:options items="${ListDay}" cssStyle="font-size: 2vmin;" />
                    </form:select>
                </td>
                <td>
                    <form:label path="upMonth" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Месяц :: </form:label>
                    <form:select path="upMonth" id="upDateMonth">
                        <form:options items="${ListMonth}" cssStyle="font-size: 2vmin;" />
                    </form:select>
                </td>
                <td>
                    <form:label path="upYearDl" cssStyle="margin-top: 1vh;margin-bottom: 2vh;margin-left: 1vw; font-size: 2.3vmin"> Год :: </form:label>
                    <form:select path="upYearDl" id="upDateYearFP">
                        <form:options items="${ListYear}" cssStyle="font-size: 2vmin;" />
                    </form:select>
                </td>
                <td>
                    <form:input path="upYearFl" id="upDateYearSP"  cssStyle="font-size: 2vmin;width: 2vw;"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <input type="submit" id="filterButton" value="Submit" style="font-size: 2vmin;margin-left: 1vw;" />
                </td>
            </tr>
        </table>
    </form:form>
</div>
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
        %>
        <tr>
            <th style="margin:0;width: 48vw;border: 1px solid black;background: white  ">
              <a href="<%= "/client/person/" + clp.getClientName() %>">
                  <p style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;" id="<%= "clientName"%>"><%= clp.getClientName() %></p>
              </a>
            </th>
            <th style="margin:0;width: 24vw;border: 1px solid black;background: white  ">
                <a href="<%= "/client/balance/" + clp.getClientName() %>">
                     <p id="balance" style="margin-left : 0;margin-right: 0; margin-top:0.4vh;margin-bottom:0.4vh;font-size:2vmin;"><%=clp.getClientBalance() %></p>
                </a>
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

