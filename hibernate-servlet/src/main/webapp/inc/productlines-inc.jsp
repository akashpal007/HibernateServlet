<c:choose>
	<c:when test="${not empty productLines}">
		<%-- ${productLines} --%>
		<h4>ProductLines Data in JSON format</h4>
		<div id="table-productLines"></div>
	</c:when>
	<!-- <c:otherwise>There is no data present. Please make a DB call by clicking on Fetch Again</c:otherwise> -->
</c:choose>

<script>
	var temp = ${productLines};
	var appendDiv = document.getElementById("table-productLines");
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