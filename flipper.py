import tkinter as tk
import random

root = tk.Tk()
root.title("My color flipper")
root.geometry("400x300")

# Create a label for your window
label = tk.Label(root, text = "Click the button to flip color", font=("Arial", 16))
label.pack(pady = 30) #pack places the label in the window and paddy adds vertical space

colors = ["green", "pink", "red", "white","purple", "blue", "green", "orange"]

def flip_color():
    color = random.choice(colors)  #picks a random color from the list

#change the background to the color of "color"
    root.configure(bg =color)
    label.config(text = f"Current color: {color}")  #update the text to show the name of the color

button = tk.Button(root, text = "Flip Color", font=("Arial", 14), command = flip_color)
button.pack(pady=20)    #for vertical spacing again

root.mainloop()