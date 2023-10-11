package design_patterns

data class Order(
    val id: String,
    val customerName: String,
    val shippingAddress: Address,
    val products: List<Product>,
    val status: OrderStatus
)

enum class OrderStatus {
    PLACED,
    PROCESSING,
    SHIPPED,
    DELIVERED
}

data class Address(
    val street: String,
    val city: String,
    val state: String,
    val zipCode: String
)

data class Product(
    val name: String,
    val quantity: Int
)

interface OrderManagementSystemSubject {
    fun addObserver(observer: OrderManagementSystemObserver)
    fun removeObserver(observer: OrderManagementSystemObserver)
    fun notifyObservers(order: Order)
}

interface OrderManagementSystemObserver {
    fun onOrderStatusChange(order: Order)
}

class OrderManagementSystem : OrderManagementSystemSubject {

    private val observers = mutableListOf<OrderManagementSystemObserver>()

    override fun addObserver(observer: OrderManagementSystemObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: OrderManagementSystemObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers(order: Order) {
        observers.forEach { it.onOrderStatusChange(order) }
    }

    fun placeOrder(order: Order) {
        // Validate the order.
        // Check if the products in the order are in stock.
        // Reserve the products in the order.
        // Create a new order record in the database.
        // Notify the customer that their order has been placed.
        notifyObservers(order)
    }

    fun updateOrderStatus(order: Order, newStatus: OrderStatus) {
        notifyObservers(order.copy(status = newStatus))
    }
}

class CustomerObserver : OrderManagementSystemObserver {
    override fun onOrderStatusChange(order: Order) {
        // Update the customer's order status display
        println("Customer ${order.status}")
    }
}

class WarehouseObserver : OrderManagementSystemObserver {
    override fun onOrderStatusChange(order: Order) {
        // Update the warehouse's inventory levels
        println("Warehouse ${order.status}")
    }
}

class ShippingCarrierObserver : OrderManagementSystemObserver {
    override fun onOrderStatusChange(order: Order) {
        // Update the shipping carrier's tracking system
        println("ShippingCarrier ${order.status}")
    }
}

class CustomerSupportObserver : OrderManagementSystemObserver {
    override fun onOrderStatusChange(order: Order) {
        // Update the customer support team's knowledge base
        println("Customer support ${order.status}")
    }
}

fun main() {
    val orderManagementSystem = OrderManagementSystem()

    // Add the observers to the order management system
    orderManagementSystem.addObserver(CustomerObserver())
    orderManagementSystem.addObserver(WarehouseObserver())
    orderManagementSystem.addObserver(ShippingCarrierObserver())
    orderManagementSystem.addObserver(CustomerSupportObserver())

    val order = Order(
        "1234567890",
        "Customer Name",
        Address(
            street = "123 Main Street",
            city = "Anytown",
            state = "CA",
            zipCode = "91234"
        ),
        listOf(
            Product("Product A", 1),
            Product("Product B", 2)
        ),
        OrderStatus.PLACED
    )
    orderManagementSystem.placeOrder(order)
    orderManagementSystem.updateOrderStatus(order, OrderStatus.SHIPPED)
}