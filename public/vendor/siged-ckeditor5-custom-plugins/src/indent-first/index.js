/**
 * @module indent-first/index
 */
import { Plugin } from 'ckeditor5';

import { IndentFirstEditing } from './editing.js';
import { IndentFirstUi } from './ui.js';

const ATTRIBUTE = 'indentFirst';

class IndentFirst extends Plugin {
	/**
	 * @inheritDoc
	 */
	static get requires() {
		return [IndentFirstEditing, IndentFirstUi];
	}

	/**
	 * @inheritDoc
	 */
	static get pluginName() {
		return 'IndentFirst';
	}
}

export { ATTRIBUTE, IndentFirstUi, IndentFirstEditing, IndentFirst };
