<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Cable Data</title>
    <link rel="stylesheet" href="style.css" type="text/css"/>
</head>
<body>
<h1>Cable Details</h1>

<table class="tg">
    <tr>
        <th width="80">ID</th>
        <th width="120">Voltage</th>
        <th width="120">nCoresXsection</th>
        <th width="120">Shape</th>
        <th width="120">OuterDiametr</th>
        <th width="120">Mass</th>
        <th width="80">Edit</th>
        <th width="80">Delete</th>
    </tr>
    <tr>
        <td>${cable.id}</td>
        <td>${cable.voltage}</td>
        <td>${cable.nCoresXsection}</td>
        <td>${cable.shape}</td>
        <td>${cable.outerDiametr}</td>
        <td>${cable.mass}</td>
    </tr>
</table>
</body>
</html>
