Feature:
        website reqres perform some operation
        
        Scenario:
                 perform get op1
                 
                 Given url "https://reqres.in/api/users?page=2"
                 When method Get
                 Then status 200
                 And print response
                 
                 Scenario:
                 perform get op1
                 
                 Given url "https://reqres.in/api/users/2"
                 When method Get
                 Then status 200
                 And print response
                 
                 Scenario:
                 perform get op1
                 
                 Given url "https://reqres.in/api/users/23"
                 When method Get
                 Then status 404
                 And print response
                 
                 Scenario:
                 perform get op1
                 
                 Given url "https://reqres.in/api/unknown"
                 When method Get
                 Then status 200
                 And print response