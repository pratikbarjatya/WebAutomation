@Search
  Feature: Search

#    Scenario Outline: Do some Search Tests
#      Examples:
#        |input      | output    |
#        | Jolly LLB | Jolly LLB |

    Scenario: Direct Search
        Given I am on hotstar application
        When I search with searchKey
        Then I should see the searchKey in search result
