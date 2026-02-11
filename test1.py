# test1.py
def greet(name: str) -> str:
    return f"Hello, {name}! Welcome to Git branching demo."

if __name__ == "__main__":
    user_name = input("Enter your name: ")
    print(greet(user_name))
