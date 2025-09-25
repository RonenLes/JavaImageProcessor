# JavaImageProcessor

A beginner-friendly image processing project written in **Java**, built while learning about **interfaces, abstraction, and object-oriented design**.  

---

## 🎨 Features
- Generate **gradients** and **circles** using RGB values  
- Apply transformations like **Transpose** and **Invert**  
- Combine images with **Mix** and **Superpose**  
- Display final results with the `Displayer` class  

---

## 🛠️ Technologies
- Java  
- Object-Oriented Programming (OOP) concepts  
- Interfaces and abstract classes  

---

## 🚀 How to Run
1. Compile all `.java` files in the `images` folder.  
   ```bash
   javac images/*.java
2. In the main class create Image object using any of the available classes:
    -Gradient(width, height, RGB startColor, RGB endColor)
    -Circle(radiusX, radiusY, RGB fillColor, RGB backgroundColor)
    -Mix(image1, image2, ratio)
    -Superpose(image1, image2)
    -Transpose(image)
    -Invert(image)
3. and then use Displayer.display(Image objcet) to display the image
4. Play around by combining Gradients, Circles, Mix, and Superpose in different ways to generate unique RGB images.



## Screenshot
<img width="1194" height="635" alt="imageProc" src="https://github.com/user-attachments/assets/1e50b64d-0ea9-4350-a178-9f9d07ccff8e" />
