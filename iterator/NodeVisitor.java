public class NodeVisitor {

    public abstract void visitProduct(ReminderVisitor reminderVisitor);

    public abstract void visitTrading(ReminderVisitor reminderVisitor);

    public abstract void visitFacade(ReminderVisitor reminderVisitor);

}
