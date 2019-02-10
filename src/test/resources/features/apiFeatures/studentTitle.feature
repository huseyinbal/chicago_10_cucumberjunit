Feature: Title verification for students

  @studentTitle
  Scenario: Student title verification
    When user hits list of students API with "http://cybertekchicago.com/student/all"
    Then user verifies each students title to be at least two letters

    @studentEmail
   Scenario: Student email vrification
     When user hits list of students API with "http://cybertekchicago.com/student/all"
     Then user verifies each students email should contain @ and . characters