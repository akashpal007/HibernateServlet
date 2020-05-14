<c:choose>
	<c:when test="${not empty orderDetails}">
	<%-- ${orderDetails} --%>
	<h4>OrderDetails Data in JSON format</h4>
	<div id="table-orderDetails"></div>
	</c:when>
	<!-- <c:otherwise>There is no data present. Please make a DB call by clicking on Fetch Again</c:otherwise> -->
</c:choose>

<script>
	var temp = ${orderDetails};
	var appendDiv = document.getElementById("table-orderDetails");
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