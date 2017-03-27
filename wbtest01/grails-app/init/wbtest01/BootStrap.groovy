package wbtest01

class BootStrap {

    def init = { servletContext ->
        new stevef.wb.Users(name:"John Doe",email:"john@foo.org").save(failOnError:true)
	new stevef.wb.Users(name:"Mary Roe",email:"mary@foo.com").save(failOnError:true)

        stevef.wb.UserGames ug1 = new stevef.wb.UserGames(name:"Monopoly",score:100.0,level:"champ",wins:10,losses:0).save(failOnError:true)
	stevef.wb.UserAchievements ua1 = new stevef.wb.UserAchievements(achievement:"Skunk Da Competition!").save(failOnError:true)
	stevef.wb.UserAchievements ua2 = new stevef.wb.UserAchievements(achievement:"Rule Them All!").save(failOnError:true)
	stevef.wb.UserAchievements ua3 = new stevef.wb.UserAchievements(achievement:"Pwn Da Luzers!").save(failOnError:true)
        new stevef.wb.Users(name:"Player 3",email:"player3@thegame.com",active:true,games:[ug1],achievements:[ua1]).save(failOnError:true)
        
    }
    def destroy = {
    }
}
