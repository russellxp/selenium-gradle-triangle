@Test @HappyPath
Feature: Triangle classification


  Scenario Outline: Verify that the given sides form the expected triangle type
    Given the user opens the triangle classification page
    When the user enters <SideA> in input A
     And the user enters <SideB> in input B
     And the user enters <SideC> in input C
     And the user clicks the Check Triangle button
     Then the system should display a console message that includes <ExpectedType>


  Examples:
    | SideA | SideB | SideC | ExpectedType    |
    | 60    | 35    | 60    | isosceles       |
    | 3     | 3     | 3     | equilateral     |
    | 4     | 5     | 6     | scalene         |
    | 1     | 2     | 10    | Not a Triangle  |
    | -1    | 2-    | 10    | Not a Triangle  |
    | S     | K     |       | Not a Triangle  |
    | @     | +´}   |>      | Not a Triangle  |
