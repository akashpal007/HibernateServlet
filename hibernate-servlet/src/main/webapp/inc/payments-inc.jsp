<c:choose>
	<c:when test="${not empty payments}">
	<%-- ${employees} --%>
	<div id="table-payments"></div>
	</c:when>
	<c:otherwise>There is no data present. Please make a DB call by clicking on Fetch Again</c:otherwise>
</c:choose>

<script>
	var temp = ${payments};
	var appendDiv = document.getElementById("table-payments");
	temp.forEach(objTemp => {
	var strObjTemp = JSON.stringify(objTemp); 
	var para = document.createElement("p");
	var node = document.createTextNode(strObjTemp);
	para.appendChild(node);
	var hr = document.createElement("hr");
	para.appendChild(hr);
	appendDiv.appendChild(para);
	});
</script>