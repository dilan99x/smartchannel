<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="Grid_Style.css" />
<!--menu script -->
<link rel="stylesheet" type="text/css" href="menu_style.css" />
<script type="text/javascript" src="js/clockp.js"></script>
<script type="text/javascript" src="js/clockh.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddaccordion.js"></script>

<script>
	function updateChannelCenter() {
		var ccId = document.getElementById("cc_id").value;
		var ccName = document.getElementById("cc_channel_center_name").value;
		var ccResCity = document.getElementById("cc_residential_city").value;
		var ccAddress = document.getElementById("cc_address").value;
		var mainCity = document.getElementById("cc_main_city").value;
		var description = document.getElementById("cc_description").value;
		var email = document.getElementById("cc_email").value;
		var web = document.getElementById("cc_web").value;
		var contactNumber = document.getElementById("cc_contact_number").value;
		var fax = document.getElementById("cc_fax").value;
		var activeStatus = 1;
        
		if(ccId == null || ccId == ""){
			alert("Please select the record you need to delete !");
		} else{
		var formInput = $(this).serialize();
		$.getJSON('ajax/updateChennaelCenter.action?channelCenterId=' + ccId
				+ '&channelCenterName=' + ccName + '&residentialCity='
				+ ccResCity + '&address=' + ccAddress + '&mainCity=' + mainCity
				+ '&description=' + description + '&isActive=' + activeStatus
				+ '&email=' +email + '&web=' +web +'&contactNumber=' +contactNumber
				+ '&fax=' +fax ,
				formInput, function(data) {

					$('.result').html('' + data.channelCenterId + '');
					$('.result').html('' + data.channelCenterName + '');
					$('.result').html('' + data.address + '');
					$('.result').html('' + data.residentialCity + '');
					$('.result').html('' + data.mainCity + '');
					$('.result').html('' + data.description + '');
					$('.result').html('' + data.isActive + '');
					$('.result').html('' + data.email + '');
					$('.result').html('' + data.web + '');
					$('.result').html('' + data.contactNumber + '');
					$('.result').html('' + data.fax + '');

					//alert('hehe nice--->' + data.channelCenterName);
					$("#cc_id").val(data.channelCenterId);
					//$("#cc_channel_center_name").val(data.channelCenterName);
					//$("#cc_address").val(data.address);
					//$("#cc_residential_city").val(data.residentialCity);
					//$("#cc_main_city").val(data.mainCity);
					//$("#cc_description").val(data.description);
					//$("#cc_active_status").val(data.activeStatus);

					$("#" + data.channelCenterId).val(data.channelCenterId);
					$("#rcg_1_ccn" + data.channelCenterId).val(
							data.channelCenterName);
					$("#rcg_1_cca" + data.channelCenterId).val(data.address);
					$("#rcg_1_ccrc" + data.channelCenterId).val(
							data.residentialCity);
					$("#rcg_1_ccmc" + data.channelCenterId).val(data.mainCity);
					$("#crg_1_ccas" + data.channelCenterId).val(data.isActive);
					$("#rcg_1_ccd" + data.channelCenterId).val(data.description);
					
					$("#rcg_1_ccemail" + data.channelCenterId).val(data.email);
					$("#rcg_1_ccweb" + data.channelCenterId).val(data.web);
					$("#rcg_1_cccn" + data.channelCenterId).val(data.contactNumber);
					$("#rcg_1_ccfax" + data.channelCenterId).val(data.fax);

					//alert(document.getElementById("rcg_1_ccn"+data.channelCenterName).value);
				});
		}
	}

	function makeClear() {

		$("#cc_id").val("");
		$("#cc_channel_center_name").val("");
		$("#cc_address").val("");
		$("#cc_residential_city").val("");
		$("#cc_main_city").val("");
		$("#cc_description").val("");
		$("#cc_active_status").val("");
		$("#cc_email").val("");
		$("#cc_contact_number").val("");
		$("#cc_active_status").val("");
		$("#cc_fax").val("");
	}

	function deleteChannelCenter() {
		var ccId = document.getElementById("cc_id").value;
		var formInput = $(this).serialize();
		$.getJSON('ajax/deleteChannelCenter.action?channelCenterId=' + ccId,
				formInput, function(data) {
					window.alert('The record has been succefully deleted !');
					if (document.readyState === 'complete') {
						//document.location.reload(true);
						window.setTimeout('location.reload()', 300);
					}
				});
	}

	function displayChannelCenterData(ccId, ccName, ccAddress, ccResCity,
			ccMainCity, ccActSts, ccDesc, ccEmail, ccWeb, ccContactNumber, ccfax) {
		$("#cc_id").val(ccId);
		$("#cc_channel_center_name").val(ccName);
		$("#cc_address").val(ccAddress);
		$("#cc_residential_city").val(ccResCity);
		$("#cc_main_city").val(ccMainCity);
		$("#cc_description").val(ccDesc);
		$("#cc_active_status").val(ccActSts);
		$("#cc_email").val(ccEmail);
		$("#cc_web").val(ccWeb);
		$("#cc_contact_number").val(ccContactNumber);
		$("#cc_fax").val(ccfax);
	}

	function channelCenterRegisterFormSubmit(evt) {
		var modelId = document.getElementById("cc_id").value;
		if (evt != null) {
			if(modelId == null || modelId==""){
				alert("Please select the record you need to delete !");
			}else{
				document.forms.channelCenterRegistrationForm.action = evt;
				document.forms.channelCenterRegistrationForm.method = "post";
				document.forms.channelCenterRegistrationForm.submit();
			}
		} 
	}
</script>


<script>
	$(function() {
		$("#cc_register1234").submit(
				function() {
					alert("Welcome....!");
					var emptyValueState = false;
					if ($("cc_channel_center_name").val == ""
							|| ($("cc_channel_center_name").val == null)) {
						emptyValueState = true;
					}
					if ($("cc_address").val == ""
							|| ($("cc_address").val == null)) {
						emptyValueState = true;
					}
					if ($("cc_residential_city").val == ""
							|| ($("cc_residential_city").val == null)) {
						emptyValueState = true;
					}
					if ($("cc_main_city").val == ""
							|| ($("cc_main_city").val == null)) {
						emptyValueState = true;
					}

					if (emptyValueState) {
						return false;
					} else {
						return true;
					}

				});

	});
</script>

<script type="text/javascript">
	ddaccordion.init({
		headerclass : "submenuheader", //Shared CSS class name of headers group
		contentclass : "submenu", //Shared CSS class name of contents group
		revealtype : "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
		mouseoverdelay : 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
		collapseprev : true, //Collapse previous content (so only one open at any time)? true/false 
		defaultexpanded : [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
		onemustopen : false, //Specify whether at least one header should be open always (so never all headers closed)
		animatedefault : false, //Should contents open by default be animated into view?
		persiststate : true, //persist state of opened contents within browser session?
		toggleclass : [ "", "" ], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
		togglehtml : [ "suffix",
				"<img src='images/plus.gif' class='statusicon' />",
				"<img src='images/minus.gif' class='statusicon' />" ], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
		animatespeed : "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
		oninit : function(headers, expandedindices) { //custom code to run when headers have initalized
			//do nothing
		},
		onopenclose : function(header, index, state, isuseractivated) { //custom code to run whenever a header is opened or closed
			//do nothing
		}
	})
</script>
<!--End menu script -->


<!--left menu Script -->
<link rel="stylesheet" href="css/leftmenu.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {

			var menu_ul = $('.leftmenu > li > ul'), menu_a = $('.leftmenu > li > a');

			menu_ul.hide();

			menu_a.click(function(e) {
				e.preventDefault();
				if (!$(this).hasClass('active')) {
					menu_a.removeClass('active');
					menu_ul.filter(':visible').slideUp('normal');
					$(this).addClass('active').next().stop(true, true)
							.slideDown('normal');
				} else {
					$(this).removeClass('active');
					$(this).next().stop(true, true).slideUp('normal');
				}
			});

		});
	</script>

	<!-- End left menu Script -->
</head>
<body>


	<!--main -->
	<div id="main">
		<!--head_slice -->
		<div id="head_slice">
			<div id="hs_bar">
				<!--hs_bar -->
			</div>
			<!--End of hs_bar -->
		</div>
		<!--End of head_slice -->

		<!--header -->
		<div id="header">
			<!--h_bar -->
			<div id="h_bar">
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				</div>
				<div>&emsp;&emsp;&emsp;</div>
				<div>
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					<s:a href="j_spring_security_logout">Logout</s:a>
				</div>
			</div>
			<!--h_bar -->
		</div>
		<!--header -->

		<!--content -->
		<div id="content">
			<!--content_bar-->
			<div id="content_bar">
				<!--left_bar-->
				<div id="left_bar">

					<!--jquery left menu-->
					<div id="wrapper">

						<ul class="leftmenu">
							<li class="item1"><a href="#">Doctor Management</a>
								<ul>
									<li class="subitem1"><s:a href="doctorRegistration">Register Doctor</s:a></li>
									<li class="subitem2"><s:a href="doctorSpeciality">Doctor Speciality</s:a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item2"><a href="#">Channel Center Management</a>
								<ul>
									<li class="subitem1"><s:a href="ChennelCenterRegistration">Register Channel Center</s:a></li>
									<li class="subitem2"><a href="#">Channel Center
											Operations<span>6</span>
									</a></li>
									<li class="subitem3"><a href="#">Administrator
											Functions<span>2</span>
									</a></li>
								</ul></li>
							<li class="item3"><a href="#">Medical Clinic Management</a>
								<ul>
									<li class="subitem1"><s:a href="registerClinic">Register Clinic</s:a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item4"><a href="#">Appointment Management</a>
								<ul>
									<li class="subitem1"><s:a href="makeAppointment">Make Appointment</s:a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item5"><a href="#">Channeling</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item3"><a href="#">Medical Test</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
						</ul>

					</div>
					<!--End jquery left menu-->

				</div>
				<!--End left_bar-->

				<!--right_bar-->
				<div id="right_bar">
					<form id="channelCenterRegistrationForm" action="addChannelCenter"
						method="post">
						<table>
							<tr>
								<td>Name</td>
								<td><s:textfield id="cc_channel_center_name"
										name="channelCenterName" required="true" label="Name"
										theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>Email</td>
								<td><s:textfield id="cc_email" name="email"
										required="true" label="Name" theme="simple"></s:textfield></td>
							</tr>
							<tr>
								<td>Address</td>
								<td><s:textfield id="cc_address" name="address"
										label="Address" required="true" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>Web</td>
								<td><s:textfield id="cc_web" name="web" label=""
										required="true" theme="simple"></s:textfield></td>
							</tr>
							<tr>
								<td>Residential City</td>
								<td><s:textfield id="cc_residential_city"
										name="residentialCity" label="Residential City"
										required="true" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>Phone No</td>
								<td><s:textfield id="cc_contact_number"
										name="contactNumber" label="" required="true" theme="simple"></s:textfield></td>
							</tr>
							<tr>
								<td>Main City</td>
								<td><s:textfield id="cc_main_city" name="mainCity"
										label="Main City" required="true" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>Fax</td>
								<td><s:textfield id="cc_fax" name="fax" label=""
										required="true" theme="simple"></s:textfield></td>
							</tr>
							<tr>
								<td>Description</td>
								<td><s:textarea id="cc_description" name="description"
										label="Description" rows="3" cols="30" theme="simple"></s:textarea></td>
								<td>&emsp;</td>
								<td colspan="2"><s:file name="imageFile" theme="simple"></s:file></td>

							</tr>
							<tr>
								<td>Active Status</td>
								<td><s:radio id="cc_active_status" name="isActive"
										list="#{'1':'Y','0':'N'}" value="1" label="Active Status"
										theme="simple"></s:radio></td>
								<td>&emsp;</td>
								<td colspan="2">&emsp;&emsp;&emsp;<input type="submit"
									value="Save" /> <input type="button" value="Update"
									onclick="updateChannelCenter()" /> <input type="button"
									value="Delete"
									onclick="channelCenterRegisterFormSubmit('deleteChannelCenter')" />
									<!--<s:submit action="deleteChannelCenter" value="Delete" theme="simple" method="m();"></s:submit> -->
									<input type="button" value="Clear" onclick="makeClear()" /></td>
							</tr>
							<tr>
								<td><input type="hidden" id="cc_id" name="channelCenterId"
									value="<s:property value="channelCenterId"/>" /></td>
							</tr>
						</table>
					</form>
					</br> </br>
					<div class="table-wrapper">
						<table class="data">
							<tr>
								<td class="cs_save_grid">Channel Center</td>
								<td class="cs_save_grid">Address</td>
								<td class="cs_save_grid">Residential City</td>
								<td class="cs_save_grid">Main City</td>
								<td class="cs_save_grid">Active Status</td>
								<td class="cs_save_grid">Description</td>
								<td class="cs_save_grid">Email</td>
								<td class="cs_save_grid">Web</td>
								<td class="cs_save_grid">Phone No</td>
								<td class="cs_save_grid">Fax</td>
							</tr>

							<s:iterator value="chanelCenterList">
								<tr>
									<td class="dynamic_grid"><input
										id="rcg_1_ccn<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property
									    value="channelCenterName"/>" /></td>

									<td class="descriptive_col"><input
										id="rcg_1_cca<s:property value="channelCenterId" />"
										class="descriptive_col" type="text"
										value="<s:property 
										value="address" />" /></td>

									<td class="dynamic_grid"><input
										id="rcg_1_ccrc<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property
									    value="residentialCity" />" />
									</td>

									<td class="dynamic_grid"><input
										id="rcg_1_ccmc<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property 
										value="mainCity" />" /></td>


									<td class="dynamic_grid"><input
										id="crg_1_ccas<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property
										value="isActive" />" /></td>


									<td width="200" class="descriptive_col"><input
										id="rcg_1_ccd<s:property value="channelCenterId" />"
										class="descriptive_col" type="text"
										value="<s:property
										value="description" />" /></td>
										
								    <td class="dynamic_grid"><input
										id="rcg_1_ccemail<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property 
										value="email" />" /></td>
										
									<td class="dynamic_grid"><input
										id="rcg_1_ccweb<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property 
										value="web" />" /></td>
										
									<td class="dynamic_grid"><input
										id="rcg_1_cccn<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property 
										value="contactNumber" />" /></td>
										
								    <td class="dynamic_grid"><input
										id="rcg_1_ccfax<s:property value="channelCenterId" />"
										class="dynamic_grid" type="text"
										value="<s:property 
										value="fax" />" /></td>
										
									<td class="myx"><input class="myx" type="button"
										onclick="displayChannelCenterData(document.getElementById('<s:property value="channelCenterId" />').value, 
										document.getElementById('rcg_1_ccn<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_cca<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_ccrc<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_ccmc<s:property value="channelCenterId" />').value,
										document.getElementById('crg_1_ccas<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_ccd<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_ccemail<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_ccweb<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_cccn<s:property value="channelCenterId" />').value,
										document.getElementById('rcg_1_ccfax<s:property value="channelCenterId" />').value)" />
									</td>

									<td class="myx"><input type="hidden"
										id="<s:property value="channelCenterId" />"
										value="<s:property value="channelCenterId" />" /></td>

								</tr>
							</s:iterator>
						</table>
					</div>

				</div>
				<!--End right_bar-->
			</div>
			<!--End content_bar -->
		</div>
		<!--End content -->

		<!--footer -->
		<div id="footer">
			<!--footer_bar-->
			<div id="footer_bar"></div>
			<!--footer_bar -->
		</div>
		<!--footer -->
	</div>
	<!--end of main -->

</body>
</html>