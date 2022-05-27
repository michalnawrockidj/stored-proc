# Example app

### Mysql
 Run `./start-dev.sh` to run MYSQL database password is hardcoded in `docker-compose-mysql.yml`
### Flyway
 Flyway will create user table and stored procedure. To execute scripts run `DemoApplication`. Flyway will execute it during the startup   

### Tests
 Very basic scenario to show DB behavior during procedure execution in    
##### testVeryComplicatedLogic - one transaction open 
##### testVeryComplicatedLogicAll - multiple transactions  