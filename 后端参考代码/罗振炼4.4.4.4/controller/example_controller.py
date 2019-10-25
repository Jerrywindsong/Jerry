from flask import Blueprint

example = Blueprint('example', __name__, url_prefix='/example')

@example.route('/get_user')
def get_user():
    return {
        'name': 'xiaow',
        'age': 20,
        'sex': 1,
        'identify': 'student'
    }