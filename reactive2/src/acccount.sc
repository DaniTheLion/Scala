object acccount {
	// an object is stateful if it's preformance depends on it's history
	
	
	val acct = new BankAccount                //> acct  : BankAccount = BankAccount@67591ba4
	acct deposit 50
 	acct withdraw 20                          //> res0: Int = 30
 	acct withdraw 20                          //> res1: Int = 10
	acct withdraw 20                          //> java.lang.Error: Insufficient funds
                                                  //| 	at BankAccount.withdraw(BankAccount.scala:11)
                                                  //| 	at acccount$$anonfun$main$1.apply$mcV$sp(acccount.scala:9)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at acccount$.main(acccount.scala:1)
                                                  //| 	at acccount.main(acccount.scala)
}