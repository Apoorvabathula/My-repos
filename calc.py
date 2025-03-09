def add(num1, num2):
  return num1 + num2

def subtract(num1, num2):
  return num1 - num2

def multiplication(num1, num2):
  return num1 * num2

def division(num1, num2):
  if num2 == 0:
      return "Error: Division by zero is not allowed."
  return num1 / num2

def display_options():
  options = """
  *** Welcome to the Calculator App ***
       Options:
      (1) Addition
      (2) Subtraction
      (3) Multiplication
      (4) Division
      (5) Exit
  *************************************************
  """
  print(options)

print("Use a Calculator to do your pesky math!")

while True:
  display_options()
  choice = int(input("Choose an option (ex: enter 1 for addition): "))

  if choice == 5:
      print("Exiting the calculator. Goodbye!")
      break

  num1 = int(input("Enter your first number: "))
  num2 = int(input("Enter your second number: "))

  if choice == 1:
      print("Result:", add(num1, num2))
  elif choice == 2:
      print("Result:", subtract(num1, num2))
  elif choice == 3:
      print("Result:", multiplication(num1, num2))
  elif choice == 4:
      print("Result:", division(num1, num2))
  else:
      print("Invalid choice, please enter a number from the options list.")
