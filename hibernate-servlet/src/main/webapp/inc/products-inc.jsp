<c:choose>
	<c:when test="${not empty products}">
		<%-- ${products} --%>
		<h4>Products Data in JSON format</h4>
		<div id="table-products"></div>
	</c:when>
	<!-- <c:otherwise>There is no data present. Please make a DB call by clicking on Fetch Again</c:otherwise> -->
</c:choose>

<script>
	var temp = ${products};
	var appendDiv = document.getElementById("table-products");
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