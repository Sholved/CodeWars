import tkinter as tk
import random

root = tk.Tk()
root.title("My color flipper")
root.geometry("400x300")
# Create a label for your window
label = tk.Label(root, test = "Click the button to flip color", font=("Arial", 16))
label.pack(pady = 30) #pack places the label in the window and paddy adds vertical space

root.mainloop
# colors[] = ["green", "pink", "red", "white", "blue", "green"]