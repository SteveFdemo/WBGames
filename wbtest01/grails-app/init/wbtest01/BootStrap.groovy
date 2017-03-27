package wbtest01

class BootStrap {

    def init = { servletContext ->
        new stevef.wb.Users(name:"John Doe",email:"john@foo.org").save(failOnError:true)
	new stevef.wb.Users(name:"Mary Roe",email:"mary@foo.com").save(failOnError:true)

        stevef.wb.Games ug1 = new stevef.wb.Games(name:"Monopoly",score:100.0,level:"champ",wins:10,losses:0).save(failOnError:true)
	stevef.wb.Achievements ua1 = new stevef.wb.Achievements(achievement:"Skunk Da Competition!").save(failOnError:true)
	stevef.wb.Achievements ua2 = new stevef.wb.Achievements(achievement:"Rule Them All!").save(failOnError:true)
	stevef.wb.Achievements ua3 = new stevef.wb.Achievements(achievement:"Pwn Da Luzers!").save(failOnError:true)
        new stevef.wb.Users(name:"Player 3",email:"player3@thegame.com",active:true,games:[ug1],achievements:[ua1]).save(failOnError:true)
        
    }
    def destroy = {
    }
}
