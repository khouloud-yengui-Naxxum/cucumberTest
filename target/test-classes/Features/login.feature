#@tag1
Feature: Test the login fonctionality

    Scenario Outline:  to login with  invalid credentials 
     
 		   Given when user open the website and go to login page 
  		 When user fill email as "<username>" and password as "<password>"  and click login
  		 Then Error massage should appear
			Then browser should be closed
			
    	 Examples: 
     
    		 |	username	|	password	|
    		 |	wrong			|	wrong			|
    		 |	yosraa		|	test123		|