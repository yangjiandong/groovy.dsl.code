// relcacing methods
//165

class BankManager {
    def loan_approval_status = false
    
    boolean approveLoan() {
        return loan_approval_status
    }
}
def myBankManager = new BankManager()
assert myBankManager.approveLoan() == false
BankManager.metaClass.approveLoan = { true }
myBankManager = new BankManager()
assert myBankManager.approveLoan() == true

