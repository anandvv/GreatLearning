function businessUser(businessName, hoursFree, acceptedPurpose) {
  // the three parameters above are properties of this object that are going to vary with different business users
  return {
    businessName,
    hoursFree,
    acceptedPurpose,
    pendingMeetings: [], // meetings yet to be approved by Elon Musk
    declinedMeetings: [], // meetings not approved by Elon Musk
    approvedMeetings: [], // meetings approved by Elon Musk
    canceledMeetings: [], // meetings already approved but later canceled maybe something came up
    feedback: '', // feedback to the booking user (user making the booking)

    getHoursFree:function hoursFree() {
      return this.hoursFree;
    },

    getFeedBack:function feedBack() {
      return this.feedback; // simply return a feedback.
    },

    newMeeting: function (meeting) {

      const { name, time, purpose } = meeting;

      if (this.hoursFree.indexOf(time) !== -1 && this.acceptedPurpose === 'any') {
        this.pendingMeetings.push(meeting);
        this.feedback = `${name}, your meeting was sent successfully. ${businessName} can now review and approve or decline`;
      } 
      else if (acceptedPurpose === purpose.toLowerCase()) {
        this.pendingMeetings.push(meeting);
        this.feedback = `${name}, your meeting was sent successfully. ${businessName} can now review and approve or decline`;
      } 
      else {
        this.feedback = `${name}, this meeting is not suitable for ${businessName}`;
      }
    },

    approveMeeting: function (id) {
      
      var previewingMeeting

      for(var i=0;i<this.pendingMeetings.length;i++) {
        if(this.pendingMeetings[i]['id']===id)
          previewingMeeting=this.pendingMeetings[i]
      }
     
      // approve previewing meeting and mark the previewingMeeting.time as a booked hour
      // note that approvedMeetings is the array while approveMeeting is the setter function
      this.approvedMeetings.push(previewingMeeting); 
      hoursFree.splice(hoursFree.indexOf(previewingMeeting.time), 1);
      this.feedback = `${previewingMeeting.name}, your meeting has been approved, time of meeting: ${previewingMeeting.time}`;
    },

    declineMeeting: function (id) {
      var previewingMeeting

      for(var i=0;i<this.pendingMeetings.length;i++){
        if(this.pendingMeetings[i]['id']===id)
          previewingMeeting=this.pendingMeetings[i]
      }

      // note that declinedMeetings is the array while declineMeeting is the setter function
      this.declinedMeetings.push(previewingMeeting); 
      this.feedback = `${previewingMeeting.name}, your meeting was declined for reasons best known to ${this.businessName}`;
    },

    cancelMeeting: function (id) {
      // the meeting has to be approved first
     
      var previewingMeeting

      for(var i=0;i<this.approvedMeetings.length;i++){
        if(this.approvedMeetings[i]['id']===id)
          previewingMeeting=this.approvedMeetings[i]
      }
      
      this.hoursFree.push(previewingMeeting.time); // make the hour of the canceled meeting a free hour
      this.canceledMeetings.push(previewingMeeting); // add canceled meeting to the array of canceled meetings
      this.approvedMeetings.splice(previewingMeeting, 1); // remove canceled meeting from approved meeting array
      this.feedback = `${previewingMeeting.name}, your meeting with ${businessName} scheduled at ${previewingMeeting.time} has been canceled with message "this meeting is not needed now"`;
    },

    requestHourCancelation: function (hr) {
      if (this.hoursFree.indexOf(hr) !== -1) {
        this.hoursFree.splice(hoursFree.indexOf(hr), 1);
      }
    },
  };
}

const virat_kohli = businessUser('Virat Kohli', [2,3,4,5,6,7,8,9], 'any'); 
// console.log(virat_kohli.getHoursFree());


var meeting1={
id: 1,
name: 'Ujjawal',
time: 8,
purpose: 'any'
}

var meeting2={
id: 2,
name: 'Sushant',
time: 9,
purpose: 'any'
}

// free hour list
console.log("Today's Free hour list")
console.log(virat_kohli.getHoursFree())

//Request a meeting
virat_kohli.newMeeting(meeting1)
console.log(virat_kohli.getFeedBack())

virat_kohli.newMeeting(meeting2)
console.log(virat_kohli.getFeedBack())


// Approve a meeting from pending meetings
virat_kohli.approveMeeting(1)
console.log(virat_kohli.getFeedBack())
console.log("See the updated free hour list below")
console.log(virat_kohli.getHoursFree())

// decline meeting from pending meetings
virat_kohli.declineMeeting(2)
console.log(virat_kohli.getFeedBack())


// Cancel meeting form approved meeting
console.log("--------------------------Meeting cancellation--------------------------")
virat_kohli.cancelMeeting(1)
console.log(virat_kohli.getFeedBack())
console.log("The cancelled meeting hour is added in the free hours. See the updated free hour list below")
console.log(virat_kohli.getHoursFree())


// remove free hour from todays list
// virat_kohli.requestHourCancelation(5)
// console.log(virat_kohli.getHoursFree())