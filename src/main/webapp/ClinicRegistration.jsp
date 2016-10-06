<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<link rel="stylesheet" type="text/css" media="all" href="jsDatePick_ltr.min.css" />
<script type="text/javascript" src="js/clockp.js"></script>
<script type="text/javascript" src="js/clockh.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddaccordion.js"></script>
<script type="text/javascript" src="js/jquery.1.4.2.js"></script>
<script type="text/javascript" src="datepickerjs/jsDatePick.jquery.min.1.3.js"></script>

<script>
	function updateChannelCenter() {
		var clinicId = document.getElementById("clinic_id").value;
		var clinicName = document.getElementById("clinic_name").value;
		var clinicTypeId = document.getElementById("clinicTypeId").value;
		var clinicDateFrom = document.getElementById("clinic_date_from").value;
		//var clinicDateTo = document.getElementById("clinic_date_to").value;
		var doctorId = document.getElementById('doctorId').value;
		var channelCenterId = document.getElementById("channelCenterId").value;
		var startHours = document.getElementById("start_hours").value;
		var startMins = document.getElementById("start_mins").value;
		var endHours = document.getElementById("end_hours").value;
		var endMins = document.getElementById("end_mins").value;
		var clinicalFee = document.getElementById("channel_fee").value;
		var consultationFee = document.getElementById("consultation_fee").value;
		var maxAppointments = document.getElementById("max_appointments").value;
		var isActive = "Y";
		var description = document.getElementById("clinic_description").value;

		if (clinicId == null || clinicId == "") {
			alert("Please select the record you need to delete !");
		} else {
			alert(clinicId + ", " + clinicName + ", " + clinicTypeId + ", " + clinicDateFrom
					+ ", " + doctorId + ", " + channelCenterId + ", " + startHours + ", " + startMins + ", " + endHours
					+ ", " + endMins + ", " + clinicalFee + ", " + consultationFee + ", " + maxAppointments + ", "
					+ isActive + ", " + description);

			var formInput = $(this).serialize();
			$.getJSON('ajax/updateClinic.action?clinicId=' + clinicId + '&clinicCode=' + clinicName + '&clinicTypeId='
					+ clinicTypeId + '&dateFrom=' + clinicDateFrom + '&doctorId='
					+ doctorId + '&channelCenterId=' + channelCenterId + '&startHrs=' + startHours + '&startMins='
					+ startMins + '&endHrs=' + endHours + '&endMins=' + endMins + '&clinicalFee=' + clinicalFee
					+ '&consultationFee=' + consultationFee + '&maxAppointments=' + maxAppointments + "&isActive="
					+ isActive + "&description=" + description, formInput, function(data) {
				$('.result').html('' + data.clinicId + '');
				$('.result').html('' + data.clinicCode + '');
				$('.result').html('' + data.clinicTypeId + '');
				$('.result').html('' + data.dateFrom + '');
				$('.result').html('' + data.doctorId + '');
				$('.result').html('' + data.channelCenterId + '');
				$('.result').html('' + data.startHrs + '');
				$('.result').html('' + data.startMins + '');
				$('.result').html('' + data.endHrs + '');
				$('.result').html('' + data.endMins + '');
				$('.result').html('' + data.clinicalFee + '');
				$('.result').html('' + data.consultationFee + '');
				$('.result').html('' + data.residence + '');
				$('.result').html('' + data.maxAppointments + '');
				$('.result').html('' + data.isActive + '');
				$('.result').html('' + data.description + '');

				//setting the updated values on the grid.
				$("#clinic_id").val(data.clinicId);
				$("#rclg_1_clinic_name" + data.clinicId).val(data.clinicCode);
				$("#rclg_1_clinic_type_name" + data.clinicId).val(data.clinicTypeCode);
				$("#rclg_1_date_from" + data.clinicId).val(data.dateFrom);
				$("#rclg_1_start_time" + data.clinicId).val(data.startTime);
				$("#rclg_1_end_time" + data.clinicId).val(data.endTime);
				$("#rclg_1_doctor_name" + data.clinicId).val(data.doctorName);
				$("#rclg_1_channel_center_name" + data.clinicId).val(data.channelCenterName);
				$("#rclg_1_clinical_fee" + data.clinicId).val(data.clinicalFee);
				$("#rclg_1_consultation_fee" + data.clinicId).val(data.consultationFee);
				$("#rclg_1_max_appointments" + data.clinicId).val(data.maxAppointments);
				$("#rclg_1_is_active" + data.clinicId).val(data.isActive);
				$("#rclg_1_description" + data.clinicId).val(data.description);
			});
		}
	}

	function makeClear() {
		$("#clinic_id").val("");
		$("#clinic_name").val("");
		$("#clinicTypeId").val("");
        $("#clinic_date_from").val("");
		$('#doctorId').val("");
		$("#channelCenterId").val("");
		$("#start_hours").val("hours");
		S("#start_mins").val("minutes");
		$("#end_hours").val("hours");
		$("#end_mins").val("minutes");
		$("#channel_fee").val("");
		$("#consultation_fee").val("");
		$("#max_appointments").val("");
		$("#is_active").val("Y");
		$("#clinic_description").val("");
	}

	function displayChannelCenterData(clinicId, clinicName, clinicTypeName, clinicTypeId, dateFrom, startTime,
			endTime, doctorName, doctorId, channelCenterName, channelCenterId, clinicalFee, consultationFee,
			maxAppointments, isActive, description) {

		$("#clinic_id").val(clinicId);
		$("#clinic_name").val(clinicName);
		$("#clinicTypeId").val(clinicTypeId);
		$("#clinic_date_from").val(dateFrom);
		$("#doctorId").val(doctorId);
		$("#channelCenterId").val(channelCenterId);
		$("#start_hours").val(
				formatTime(startTime) != null && formatTime(startTime) != "" ? formatTime(startTime)[0] : "hours");
		$("#start_mins").val(
				formatTime(startTime) != null && formatTime(startTime) != "" ? formatTime(startTime)[1] : "mins");
		$("#end_hours")
				.val(formatTime(endTime) != null && formatTime(endTime) != "" ? formatTime(endTime)[0] : "hours");
		$("#end_mins").val(formatTime(endTime) != null && formatTime(endTime) != "" ? formatTime(endTime)[1] : "mins");
		$("#channel_fee").val(clinicalFee);
		$("#consultation_fee").val(consultationFee);
		$("#max_appointments").val(maxAppointments);
		$("#is_active").val(isActive);
		$("#clinic_description").val(description);
		formatTime(startTime);
	}

	function formatTime(time) {
		if (time != null && time != "") {
			var arr = time.split(":");
			return arr;
		}
	}

	function clinicRegisterFormSubmit(event, operation) {
		alert(operation);
		var modelId = document.getElementById("clinic_id").value;
		if (event != null) {
			if (modelId == null || modelId == "") {
				alert("Please select the record you need to " + operation + " !");
			} else {
				document.forms.clinicRegistrationForm.action = event;
				document.forms.clinicRegistrationForm.method = "post";
				document.forms.clinicRegistrationForm.submit();
			}
		}
	}
</script>

<script type="text/javascript">
	window.onload = function() {
		g_globalObject = new JsDatePick({
			useMode : 2,
			isStripped : true,
			target : "clinic_date_from",
			dateFormat : "%d-%M-%Y"
		});

		g_globalObject2 = new JsDatePick({
			useMode : 2,
			isStripped : false,
			target : "clinic_date_to",
			dateFormat : "%d-%M-%Y"
		});
	};
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
		togglehtml : [ "suffix", "<img src='images/plus.gif' class='statusicon' />",
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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {

			var menu_ul = $('.leftmenu > li > ul'), menu_a = $('.leftmenu > li > a');

			menu_ul.hide();

			menu_a.click(function(e) {
				e.preventDefault();
				if (!$(this).hasClass('active')) {
					menu_a.removeClass('active');
					menu_ul.filter(':visible').slideUp('normal');
					$(this).addClass('active').next().stop(true, true).slideDown('normal');
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
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
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
									<li class="subitem1"><s:a href="doctorManagement/doctorRegistration">Register Doctor</s:a></li>
									<li class="subitem2"><s:a href="doctorSpeciality">Doctor Speciality</s:a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item2"><a href="#">Channel Center Management</a>
								<ul>
									<li class="subitem1"><s:a href="ChennelCenterRegistration">Register Channel Center</s:a></li>
									<li class="subitem2"><a href="#">Channel Center Operations<span>6</span>
									</a></li>
									<li class="subitem3"><a href="#">Administrator Functions<span>2</span>
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
					<form id="clinicRegistrationForm" action="clinicSupport!addClinics.action" method="post">
						<table>
							<tr>
								<td>Clinic Name</td>
								<td><s:textfield id="clinic_name" name="clinicCode" required="true" label="" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>Clinic Type</td>
								<td><s:select id="clinic_types_id" list="clinicTypes" name="clinicTypeId" value="clinicTypeId" listKey="key" listValue="value"
										headerValue="Select Doctors" theme="simple" /></td>

							</tr>
							<tr>
								<td>Clinic Date</td>
								<td><s:textfield id="clinic_date_from" name="dateFrom" readonly="true" required="true" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
							</tr>
							<tr>
								<td>Doctor</td>
								<td><s:select id="doctors_id" list="doctors" name="doctorId" value="doctorId" listKey="key" listValue="value"
										headerValue="Select Doctors" theme="simple" /></td>
								<td>&emsp;</td>
								<td>Hospital</td>
								<td><s:select id="channel_centers_id" list="channelCenters" name="channelCenterId" value="channelCenterId" listKey="key"
										listValue="value" headerValue="Select Doctors" theme="simple" /></td>

							</tr>
							<td>Start Time</td>
							<td><s:select list="{'hours','1','2','3','4','5', '6', '7', '8', '9', '10', '11', '12'}" name="startHrs"
									id="start_hours" theme="simple" /> <s:select list="{'minutes','00','15','30','45'}" name="startMins"
									id="start_mins" theme="simple" /></td>
							<td>&emsp;</td>
							<td>End Time</td>
							<td><s:select list="{'hours','1','2','3','4','5', '6', '7', '8', '9', '10', '11', '12'}" name="endHrs"
									id="end_hours" theme="simple" /> <s:select list="{'minutes','00','15','30','45'}" name="endMins" id="end_mins"
									theme="simple" /></td>
							<tr>
								<td>Channel Fee</td>
								<td><s:textfield id="channel_fee" name="clinicalFee" required="true" label="" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>Consultation Fee</td>
								<td><s:textfield id="consultation_fee" name="consultationFee" required="true" label="" theme="simple"></s:textfield></td>
							</tr>

							<tr>
								<td>Appointmnets</td>
								<td><s:select list="{'10', '15', '20', '25'}" name="maxAppointments" id="max_appointments" theme="simple" /></td>
								<td>&emsp;</td>
								<td>Active</td>
								<td><s:radio name="isActive" list="{'Y','N'}" value="isActive" id="is_active" theme="simple" /></td>
							</tr>

							<tr>
								<td>Description</td>
								<td><s:textarea id="clinic_description" name="description" label="Description" rows="3" cols="30"
										theme="simple"></s:textarea></td>
								<td>&emsp;</td>
								<td colspan="2">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<input type="submit" value="Save" /> <input
									type="button" value="Update" onclick="clinicRegisterFormSubmit('clinicSupport!updateClinic.action', 'update')" />
									<input type="button" value="Delete"
									onclick="clinicRegisterFormSubmit('clinicSupport!deleteClinic.action', 'delete')" /> <input type="button"
									value="Clear" onclick="makeClear()" /></td>
							</tr>
							<tr>
								<td><input type="hidden" id="clinic_id" name="clinicId" value="<s:property value="clinicId"/>" /></td>
							</tr>


						</table>
					</form>
					</br> </br>
					<div class="table-wrapper">
						<table class="data">
							<tr>
								<td class="cs_save_grid">Clinic Name</td>
								<td class="cs_save_grid">Clinic Type</td>
								<td class="cs_save_grid">From Date</td>
								<td class="cs_save_grid">Start Time</td>
								<td class="cs_save_grid">End Time</td>
								<td class="cs_save_grid">Doctor Name</td>
								<td class="cs_save_grid">Channel Center</td>
								<td class="cs_save_grid">Channel Fee</td>
								<td class="cs_save_grid">Consultation Fee</td>
								<td class="cs_save_grid">Appointments</td>
								<td class="cs_save_grid">Active</td>
								<td class="cs_save_grid">Description</td>
							</tr>

							<s:iterator value="clinicList">
								<tr>
									<td class="dynamic_grid"><input id="rclg_1_clinic_name<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="clinicCode"/>" /></td>

									<td class="dynamic_grid"><input id="rclg_1_clinic_type_name<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="clinicTypeCode"/>" /></td>

									<td class="dynamic_grid"><input id="rclg_1_date_from<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="dateFrom"/>" /></td>

									<td class="dynamic_grid"><input id="rclg_1_start_time<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="startTime" />" /></td>

									<td class="dynamic_grid"><input id="rclg_1_end_time<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="endTime" />" /></td>


									<td class="dynamic_grid"><input id="rclg_1_doctor_name<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="doctorName" />" /></td>

									<td class="dynamic_grid"><input id="rclg_1_channel_center_name<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="channelCenterName" />" /></td>

									<td class="dynamic_grid"><input id="rclg_1_clinical_fee<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="clinicalFee" />" /></td>

									<td class="dynamic_grid"><input id="rclg_1_consultation_fee<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="consultationFee" />" /></td>

									<td class="dynamic_grid"><input id="rclg_1_max_appointments<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="maxAppointments" />" /></td>

									<td class="dynamic_grid"><input id="rclg_1_is_active<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="isActive" />" /></td>

									<td class="descriptive_col"><input id="rclg_1_description<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="description" />" /></td>


									<td class="myx"><input class="myx" type="button"
										onclick="displayChannelCenterData(document.getElementById('<s:property value="clinicId" />').value, 
										document.getElementById('rclg_1_clinic_name<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_clinic_type_name<s:property value="clinicId" />').value,
										document.getElementById('<s:property value="clinicTypeId" />').value,
										document.getElementById('rclg_1_date_from<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_start_time<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_end_time<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_doctor_name<s:property value="clinicId" />').value,
										document.getElementById('<s:property value="doctorId" />').value,
										document.getElementById('rclg_1_channel_center_name<s:property value="clinicId" />').value,
										document.getElementById('<s:property value="channelCenterId" />').value,
										document.getElementById('rclg_1_clinical_fee<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_consultation_fee<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_max_appointments<s:property value="clinicId" />').value,
										document.getElementById('rclg_1_is_active<s:property value="clinicId" />').value,
										
										
										
										
										document.getElementById('rclg_1_description<s:property value="clinicId" />').value)" />
									</td>

									<td class="myx"><input type="hidden" id="<s:property value="clinicId" />"
										value="<s:property value="clinicId" />" /> <input type="hidden" id="<s:property value="clinicTypeId" />"
										value="<s:property value="clinicTypeId" />" /> <input type="hidden" id="<s:property value="doctorId" />"
										value="<s:property value="doctorId" />" /> <input type="hidden" id="<s:property value="channelCenterId" />"
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