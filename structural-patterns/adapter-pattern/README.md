# Definition

The Adapter pattern is used to translate the interface of one class into another interface. This means that we can make classes work together that
couldn't otherwise because of incompatible interfaces. A class adapter uses multiple inheritance (by extending one class and/or implementing one or
more classes) to adapt one interface to another. An object adapter relies on
object aggregation.


# Adapter Pattern Example

This is a simple example demonstrating the use of the Adapter Pattern in Java. In this example, we have two versions of an `OrderDetails` class: `OrderDetailsV1` and `OrderDetailsV2`. `OrderDetailsV1` has `getOrderDetails` and `cancelItem` methods, while `OrderDetailsV2` has `getOrderDetails`, `addItem`, and `cancelOrder` methods. We need to create an adapter to use `getOrderDetails` and `cancelItem` from `OrderDetailsV1`, and `addItem` and `cancelOrder` from `OrderDetailsV2`.

## Structure

- `OrderDetailsV1`: (Existing Interface) representing the first version of order details.
- `OrderDetailsV2`: (Forced Interface) representing the second version of order details.
- `OrderDetailsV1Impl`: (Adaptee) existing class.
- `OrderDetailsAdapter`: Adapter class that adapts `OrderDetailsV2` to `OrderDetailsV1` interface.
- `Driver`: Client
- 

## Explanation

- In this example, we have two versions of the OrderDetails class with different interfaces. We want to use the methods from both versions together. We achieve this using the Adapter Pattern:
- We create an instance of OrderDetailsV2 and use it to create an instance of OrderDetailsAdapter, which implements OrderDetailsV1 interface.
- We then use the adapter to call getOrderDetails and cancelItem methods from OrderDetailsV1, and addItem and cancelOrder methods from OrderDetailsV2.

## Where to Use:

- When you want to use an existing class, and its interface does not match the one you need.
- When you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces.
- When you want to increase transparency of classes.


## Benefits:

- Highly class reusable.

## Usage:

1. Clone the repository.
2. Run `Driver` to see the pattern in action.

