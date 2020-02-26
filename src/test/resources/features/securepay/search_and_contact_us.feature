Feature: User Searches for SecurePay online and Contacts using the contact us form

  Scenario: Submit details via Contact Us Form
    Given User is on the Google home page
    When he searches for "SecurePay"
    Then all the result titles should contain the word "SecurePay"
    When he selects the first link
    Then validate he has reached the homepage
 	  When he navigates to "Contact Us"
 	  And validate he has reached the contact us page
    Then he enters all the information on the contact us page
