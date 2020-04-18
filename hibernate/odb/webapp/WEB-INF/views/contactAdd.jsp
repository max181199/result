<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 14.04.2020
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>contact_ADD_</title>
</head>
<body>
<div style="margin-bottom: 2vh;margin-top: 0">
    <a href="<%= "/client/person/" + request.getAttribute("backKey") %>">
        <button style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin;"> Back </p>
        </button>
    </a>
</div>
<div style="margin-top: 0vh; margin-bottom: 2vh">
    <form:form method="POST" action="<%= "/contact/add/" + request.getAttribute("backKey")%>"
               modelAttribute="c_model">
        <table>
            <tr>
                <td>
                    <form:label path="contactName" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> ContactName :: </form:label>
                    <form:input path="contactName"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>

            </tr>
            <tr>
                <td>
                    <form:label path="addAdress" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> Base Address :: </form:label>
                    <form:input path="addAdress"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>

            </tr>
            <tr>
                <td>
                    <form:label path="addPhone" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> Base Phone Number :: </form:label>
                    <form:input path="addPhone"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>

            </tr>
            <tr>
                <td>
                    <form:label path="addEmail" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> Base Email :: </form:label>
                    <form:input path="addEmail"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>

            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <input type="submit" value="Add" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
