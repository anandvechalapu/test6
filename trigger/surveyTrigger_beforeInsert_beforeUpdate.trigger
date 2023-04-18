trigger SurveyTrigger on Survey__c (before insert, before update) {
  //Check if Domain is India, USA, or Both
  List<String> domainList = new List<String>{'India', 'USA', 'Both'};
  for(Survey__c s : Trigger.new){
    if(!domainList.contains(s.Domain__c)){
      s.addError('The Domain field must be India, USA, or Both.');
    }
  }
 
  //Check if Status is Active or Inactive
  List<String> statusList = new List<String>{'Active', 'Inactive'};
  for(Survey__c s : Trigger.new){
    if(!statusList.contains(s.Status__c)){
      s.addError('The Status field must be Active or Inactive.');
    }
  }
 
  //Check if Survey State is Not Started, Started, Cancelled, or Completed
  List<String> surveyStateList = new List<String>{'Not Started', 'Started', 'Cancelled', 'Completed'};
  for(Survey__c s : Trigger.new){
    if(!surveyStateList.contains(s.Survey_State__c)){
      s.addError('The Survey State field must be Not Started, Started, Cancelled, or Completed.');
    }
  }
 
  //Check if Page Name or Location is Home, Profile, Search Post, Post detail, or Webinar Detail
  List<String> pageNameList = new List<String>{'Home', 'Profile', 'Search Post', 'Post detail', 'Webinar Detail'};
  for(Survey__c s : Trigger.new){
    if(!pageNameList.contains(s.Page_Name_or_Location__c)){
      s.addError('The Page Name or Location field must be Home, Profile, Search Post, Post detail, or Webinar Detail.');
    }
  }
 
  //Check if Target User is All Users or Exclude Users
  List<String> targetUserList = new List<String>{'All Users', 'Exclude Users'};
  for(Survey__c s : Trigger.new){
    if(!targetUserList.contains(s.Target_User__c)){
      s.addError('The Target User field must be All Users or Exclude Users.');
    }
  }
 
  //Check if Answer Type is Single Choice, Multi Choice, Text, or Rating
  List<String> answerTypeList = new List<String>{'Single Choice', 'Multi Choice', 'Text', 'Rating'};
  for(Survey__c s : Trigger.new){
    if(!answerTypeList.contains(s.Answer_Type__c)){
      s.addError('The Answer Type field must be Single Choice, Multi Choice, Text, or Rating.');
    }
  }
 
  //Check if Rating is between 0 and 5
  List<Integer> ratingList = new List<Integer>{0,1,2,3,4,5};
  for(Survey__c s : Trigger.new){
    if(!ratingList.contains(s.Rating__c)){
      s.addError('The Rating field must be between 0 and 5.');
    }
  }
}