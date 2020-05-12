<c:choose>
	<c:when test="${not empty offices}">
		<%-- ${customers} --%>
		<div id="table-offices"></div>
	</c:when>
	<c:otherwise>There is no data present. Please make a DB call by clicking on Fetch Again</c:otherwise>
</c:choose>

<script>
	var temp = ${offices};
	var appendDiv = document.getElementById("table-offices");
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