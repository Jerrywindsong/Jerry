from flask import Flask
from flask_cors import CORS
from controller import example_controller

app = Flask(__name__)
app.register_blueprint(example_controller.example)

@app.route('/')
def hello():
    return 'hello'

if __name__ == '__main__':
    CORS(app, supports_credentials=True)
    app.run(host='localhost', port=80)