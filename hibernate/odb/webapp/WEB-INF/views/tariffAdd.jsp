<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 16.04.2020
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tariff_ADD_</title>
</head>
<body>
<div style="margin-bottom: 2vh">
    <a href="<%= "/service/" + request.getAttribute("absName")%>">
        <button style="height: 7vh;width: 10vw;margin:0;">
            <p style="font-size: 2vmin;"> Back </p>
        </button>
    </a>
</div>
<div>
    <form:form method="POST"
               modelAttribute="t_model">
        <table>
            <tr>
                <td>
                    <form:label path="tariffCost" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Cost :: </form:label>
                    <form:input path="tariffCost"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="tariffValue" type="float" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Value :: </form:label>
                    <form:input path="tariffValue" type="float" cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="tariffDaypaymode" type="float" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Max Credit Day :: </form:label>
                    <form:checkbox path="tariffDaypaymode"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <input type="submit" value="Add" style="font-size: 200px;margin-left: 1vw;" />
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
