function setupReceiver(name, freeSlots, reason){
    return {
        name: name,
        freeSlots: freeSlots,
        pendingMeetings: [],
        acceptedMeetings: [],
        rejectedMeetings: [],
        canceledMeetings: [],
        feedback: '',
        requestMeeting(meeting){
            if(this.freeSlots.includes(meeting.slot)){
                this.pendingMeetings.push(meeting.slot);

                this.feedback = `${meeting.name}, your meeting has been captured. ${this.name} may accept or reject your request!`;
            }
        },
        acceptMeeting(id){
            console.log(this.pendingMeetings);

            for(var i = 0; i < this.pendingMeetings.length; i++){
                if(this.pendingMeetings[i] === id){
                    const removedItems = this.pendingMeetings.splice(i, 1);
                    let selectedMeeting = removeItems[0];
                    console.log(selectedMeeting);
                    this.acceptedMeetings.push(selectedMeeting);
                    //remove from free slots
                    this.freeSlots.fin
                }
            }
        },
        rejectMeeting(id){

        },
        cancelMeeting(id){

        }
    };
}

const kohliCalendar = setupReceiver('Virat Kohli', [2,5,7,9,10], 'selfie');

kohliCalendar.requestMeeting({
    id: 1,
    name: 'Anand',
    reason: 'selfie',
    slot: 7
});

console.log(kohliCalendar.feedback);

kohliCalendar.requestMeeting({
    id: 2,
    name: 'Pats',
    reason: 'selfie',
    slot: 7
});

console.log(kohliCalendar.feedback);

