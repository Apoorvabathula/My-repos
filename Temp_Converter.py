def ctof(temp2):
    return (temp2 * 9/5) + 32

def ftoc(temp):
    return (temp - 32) * 5/9

def display_options():
    options = """
        *** Welcome to the Temperature Converter App ***
            Conversion Options
            (1) Fahrenheit to Celsius
            (2) Celsius to Fahrenheit
        *************************************************
    """
    print(options)

while True:
    display_options()

    options = int(input("Choose conversion option (1 or 2): "))
    inputemp = float(input("Enter input temperature: "))

    if options == 1:
        convert = ftoc(inputemp)
        output = f"{inputemp}°F is {convert:.2f}°C"
    elif options == 2:
        convert = ctof(inputemp)
        output = f"{inputemp}°C is {convert:.2f}°F"
    else:
        print("Invalid option. Please enter 1 or 2.")
        continue  

    print(output)
    
    keep_converting = input("Would you like to convert another temperature? (y/n): ").lower()
    
    if keep_converting != "y":
        print("Goodbye!")
        break
