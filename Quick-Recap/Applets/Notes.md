# Applets 

## What is a Applet?
- A Applet is a small Java program that runs inside a web browser or applet viewer.
- It is used to create dynamic, interactive web content such as graphics, animations, games, and simple user interfaces.
- Applets run within a restricted environment called the sandbox, which limits access to system resources for security.

## Applet Lifecycle
Java Applets have a predefined lifecycle managed by the browser or applet viewer with the following main methods:
- **init()**  
  Called once when the applet is first loaded. Used for initialization, such as setting background color or loading resources.
  
- **start()**  
  Called after `init()` and every time the applet is restarted or the user revisits the page.
  
- **paint(Graphics g)**  
  Called whenever the applet needs to redraw its contents, such as when the window is resized or uncovered. The `Graphics` object is used to draw shapes, text, or images.
  
- **stop()**  
  Called when the applet is stopped, such as when the user navigates away from the page.
  
- **destroy()**  
  Called when the applet is unloaded completely, allowing cleanup of resources.

## Graphics and Drawing
- The `Graphics` class provides methods to draw primitive shapes and text:
  - Rectangles, lines, ovals, arcs, polygons, and text.
- Drawing is done primarily in the `paint()` method.
- Colors and fonts can be set on the `Graphics` object.
- Filling shapes (e.g., filled rectangle or polygon) differs from just drawing the outline.
- Coordinates start from the top-left corner (0,0).

## Event Handling in Applets
- Applets can respond to user interactions such as mouse clicks, keyboard input, and button presses.
- Event listeners must be implemented and registered with components (e.g., buttons).
- Common event interfaces include:
  - `ActionListener` for button clicks.
  - `MouseListener` and `MouseMotionListener` for mouse events.
  - `KeyListener` for keyboard events.
- Event handling methods, such as `actionPerformed()`, define the response logic.

## Applet HTML Integration
- Applets are embedded into web pages using the `<applet>` tag specifying:
  - The applet’s class file.
  - The width and height of the display area.
- The browser loads the applet bytecode and executes it inside the sandbox.

## Advantages of Applets
- Platform independence: Run on any machine with Java support.
- Easy to embed interactive programs into web pages.
- Secure execution environment limits harmful actions.
- Useful for educational purposes and simple graphical demos.

## Limitations and Modern Context
- Applets require the Java plugin, which is no longer supported in most modern browsers.
- Security restrictions limit filesystem and network access.
- Replaced by newer technologies like Java Web Start, JavaFX, and web-based frameworks.
- Still valuable for learning Java GUI, event handling, and graphics programming fundamentals.

## Important Points to Remember
- Always override `init()` and `paint()` methods at minimum.
- Use `repaint()` to request redraws.
- Manage resources carefully to avoid memory leaks.
- Event handling is essential for interactive applets.
- Understand the coordinate system and how shapes are drawn.
- Applets run inside a sandbox with restricted permissions for security.

---
