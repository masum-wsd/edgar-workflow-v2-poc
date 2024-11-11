# -- Project information -----------------------------------------------------
project = 'Your Project Name'
author = 'Your Name or Team'
release = '0.1'

# -- General configuration ---------------------------------------------------
extensions = [
    'sphinx.ext.autodoc',
    'sphinx.ext.napoleon',  # If you use Google or NumPy style docstrings
]
templates_path = ['_templates']
exclude_patterns = []

# -- Options for HTML output -------------------------------------------------
html_theme = 'alabaster'  # or another theme like 'sphinx_rtd_theme'