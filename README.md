# Homework Assignment: Implementing Proxy and Flyweight Patterns

This project demonstrates the use of two popular design patterns—**Proxy Pattern** and **Flyweight Pattern**—in real-world applications.

## Table of Contents

- [Project Overview](#project-overview)
- [Design Patterns Used](#design-patterns-used)
  - [Proxy Pattern](#proxy-pattern)
  - [Flyweight Pattern](#flyweight-pattern)
- [Key Implementation Features](#key-implementation-features)
- [Conclusion](#conclusion)

## Project Overview

This project consists of two modules:
1. **Proxy Pattern Module:** Simulates an image management system for a real estate agency. It displays low-resolution thumbnails immediately while loading high-resolution images only on demand (via the `displayFullImage()` method). A protected proxy is also implemented to allow image upload and replacement only for authenticated agents.
2. **Flyweight Pattern Module:** Implements a map application that renders thousands of markers (e.g., gas stations, restaurants, hospitals). Instead of duplicating style data for each marker, shared style objects (icon, color, label style) are reused, greatly reducing memory consumption.

## Design Patterns Used

### Proxy Pattern

**Problem Addressed:**  
Loading high-resolution images can be resource-intensive and slow down the system.

**Solution:**  
- **Lazy Loading:** The proxy initially shows a low-resolution thumbnail and loads the full image only when required.
- **Access Control:** A protective proxy restricts image uploads/replacements to only authorized users.

**Key Files:**
- `Image.java` — Interface defining image operations.
- `RealImage.java` — Class representing the actual high-resolution image.
- `ImageProxy.java` — Proxy for lazy loading of high-resolution images.
- `ProtectedImageProxy.java` — Extended proxy that checks user authorization.
- `ProxyPatternDemo.java` — Demo class to showcase the pattern in action.

### Flyweight Pattern

**Problem Addressed:**  
Storing duplicate style data for thousands of map markers can lead to significant memory overhead.

**Solution:**  
- **Shared Objects:** The Flyweight pattern is used to share marker style objects among many marker instances.
- **Memory Efficiency:** By reusing common style data (icon, color, label style), the overall memory footprint is greatly reduced.

**Key Files:**
- `MarkerStyle.java` — Class representing the marker style.
- `MarkerStyleFactory.java` — Factory class for creating and managing shared marker style objects.
- `Marker.java` — Class representing a map marker that uses a marker style.
- `FlyweightPatternDemo.java` — Demo class to showcase the pattern in action.

**Key Implementation Features**

Efficient Resource Loading:
The Proxy pattern delays the loading of high-resolution images until necessary, enhancing system responsiveness.
Access Control:
The Protected Proxy ensures that only authenticated users can perform critical operations such as uploading or replacing images.
Memory Optimization:
The Flyweight pattern reduces memory usage by sharing style objects among thousands of markers, rather than duplicating data for each instance.
Logging and Analysis:
The implementation logs the creation of new style objects, providing insight into the efficiency gains from reusing shared objects.

**Conclusion**

This project showcases how design patterns can greatly improve the scalability, performance, and security of applications. The use of Proxy and Flyweight patterns simplifies the architecture, making the system more maintainable and efficient. This implementation demonstrates a clear understanding of advanced design principles that are crucial for modern software development.

