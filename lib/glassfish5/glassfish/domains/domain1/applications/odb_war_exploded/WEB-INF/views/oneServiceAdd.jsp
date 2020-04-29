<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 15.04.2020
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>oneService_ADD_</title>
</head>
<body>
<div style="margin-top: 0;width: 45vw; border: 1px solid black;margin-bottom: 0 ">
    <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Service Info </h2>
</div>
<div style="border: 1px solid black; width: 45vw ; margin-bottom: 0;margin-top: 0">
    <div style="margin-bottom: 2vh;margin-right: 0; margin-top: 2vh;margin-left: 2vw">
        <a href="/service" style="width: 4vw;margin: 0;">
            <button id="back" style="height: 7vh;width: 10vw;margin:0;">
                <p style="margin: 0;font-size: 2vmin;" > Back </p>
            </button>
        </a>
    </div>
    <div>
        <form:form method="POST" action="/service/add"
                   modelAttribute="os_model">
            <table>
                <tr>
                    <td>
                        <form:label path="serviceName" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Name :: </form:label>
                        <form:input id="name" path="serviceName"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td>
                        <form:label path="serviceType"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Type :: </form:label>
                        <form:input id="type" path="serviceType"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td>
                        <form:label path="serviceState"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">State :: </form:label>
                        <form:checkbox id="state" path="serviceState"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td>
                        <form:label path="serviceDescribe"  cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Describe :: </form:label>
                        <form:textarea id="describe" path="serviceDescribe"  cssStyle="margin-right :  1vw; margin-left:1vw; max-width: 42vw; max-height: 58vh;margin-top: 2vh;font-size: 2vmin; width: 42vw;height: 58vh"/>
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td>
                        <input id="add" type="submit" value="Add" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
</div>

</body>
</html>
