# Definition

Decouple an abstraction or interface from its implementation so that the two can vary independently.
Bridge makes a clear-cut between abstraction and implementation.


# Bridge Pattern in E-commerce Product Search

This project showcases the Bridge Pattern in an e-commerce application for product search functionality. The Bridge Pattern decouples the abstraction of product search from its various search engine implementations, allowing them to vary independently.

## Components:

1. **SearchEngine Interface**: Implementor
   - Defines search engine implementations with a `search(String query)` method.

2. **Concrete Implementations**: ConcreteImplementor
   - `LuceneSearchEngine`: Uses Lucene search engine.
   - `ElasticSearchEngine`: Utilizes Elasticsearch.

3. **ProductSearch Class**: Abstractor
   - Abstracts product search functionality.
   - Relies on the `SearchEngine`(implementor) interface.
   - Provides `searchProducts(String query)` method.

4. **Client Code**:
   - `Driver`: Demonstrates usage of the Bridge Pattern.
   -  The client code can use the ProductSearch abstraction to perform product searches with different search engine implementations without directly coupling to specific search engines, 
      achieving flexibility and decoupling between abstraction and implementation.


## Where to Use:

- When you want to separate the abstract structure and its concrete implementation.
- When you want to share an implementation among multiple objects,
- When you want to reuse existing resources in an 'easy to extend' fashion.
- When you want to hide implementation details from clients. Changes in implementation should have no impact on clients.

## Benefits:

- **Flexibility**: Allows independent evolution of abstraction and implementation.
- **Clean Code**: Encourages separation of concerns.
- **Extensibility**: Facilitates easy addition or modification of search engines.

## Usage:

1. Clone the repository.
2. Run `Driver` to see the pattern in action.

