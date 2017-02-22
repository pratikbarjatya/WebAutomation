@Subscriptions
  Feature: Subscriptions - Sign In and Sign Out

    Scenario: Sign in to Application
      When I open hotstar website
      And I sign in
      Then I click on my account
      And I certify login

    Scenario: Sign in Sign out to Application
      When I open hotstar website
      And I sign in
      Then I sign out
      And I certify signout

#  Scenario: Sign in with Premium account
#    When I open hotstar website
#    And I sign in
#    Then I click on my account
#    And  I certify Premium Member Account
#
#  Scenario: Sign in with Non Premium account
#    When I open hotstar website
#    And I sign in
#    Then I click on my account
#    And I certify Non Premium Member Account

#  Scenario: Sign in with Email
#    When I open hotstar website
#    And I sign in
#    Then I click on my account
#    And I certify Sign in with Email


